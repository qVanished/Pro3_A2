package com.example.demo.service;

import com.example.demo.DTO.AnimalDTO;
import com.example.demo.entities.Animal;
import com.example.demo.generated.*;
import com.google.protobuf.Timestamp;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GrpcClient
{
    ManagedChannel channel;
    SlaughterHouseGrpc.SlaughterHouseBlockingStub stub;

    public GrpcClient()
    {
        channel = ManagedChannelBuilder.forAddress("localhost", 4444)
            .usePlaintext()
            .build();

        stub = SlaughterHouseGrpc.newBlockingStub(channel);
    }

    private Timestamp convertToTimestamp(LocalDate date)
    {
        Instant instant = date.atStartOfDay(ZoneId.systemDefault()).toInstant();

        return Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).setNanos(instant.getNano()).build();
    }

    public Optional<AnimalDTO> findById(int id)
    {
        AnimalRequest req = AnimalRequest.newBuilder()
            .setAnimalId(id)
            .build();

        try{
            AnimalRes res = stub.findById(req);
            return Optional.of(
                new AnimalDTO(res.getId(), LocalDate.now(), res.getWeight(),
                    res.getOrigin()));
        }catch(Exception e){
            e.printStackTrace();
            return Optional.empty();
        }
    }

    public List<AnimalDTO> findByDate(LocalDate date)
    {
        DateRequest req = DateRequest.newBuilder()
            .setDate(convertToTimestamp(date))
            .build();

        try{
            AnimalListResponse res = stub.findByDate(req);
            List<AnimalRes> animalsRes = res.getAnimalsList();
            List<AnimalDTO> animalsDTO = new ArrayList<>();
            for(AnimalRes animalRes : animalsRes){
                animalsDTO.add(new AnimalDTO(animalRes.getId(), LocalDate.now(), animalRes.getWeight(), animalRes.getOrigin()));
            }
            return animalsDTO;
        }catch(Exception e){
            e.printStackTrace();
            return List.of();
        }
    }

    public List<AnimalDTO> findByOrigin(String origin)
    {
        OriginRequest req = OriginRequest.newBuilder()
            .setOrigin(origin)
            .build();

        try{
            AnimalListResponse res = stub.findByOrigin(req);
            List<AnimalRes> animalsRes = res.getAnimalsList();
            List<AnimalDTO> animalsDTO = new ArrayList<>();
            for(AnimalRes animalRes : animalsRes){
                animalsDTO.add(new AnimalDTO(animalRes.getId(), LocalDate.now(), animalRes.getWeight(), animalRes.getOrigin()));
            }
            return animalsDTO;
        }catch(Exception e){
            e.printStackTrace();
            return List.of();
        }
    }
}
