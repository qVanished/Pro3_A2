package com.example.demo.service;

import com.example.demo.entities.Animal;
import com.example.demo.entities.Product;
import com.example.demo.generated.*;
import com.example.demo.repository.IAnimalRegistrationService;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.grpc.server.service.GrpcService;

import com.google.protobuf.Timestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@GrpcService public class SlaughterHouseImpl extends SlaughterHouseGrpc.SlaughterHouseImplBase
{
    @Autowired private IAnimalRegistrationService animalRegistrationService;

    private LocalDate convertToLocalDate(Timestamp timestamp) {
        Instant instant = Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());
        LocalDate time = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        return time;
    }

    @Override public void findById(AnimalRequest request,
        StreamObserver<AnimalRes> responseObserver)
    {
        Optional<Animal> animal = animalRegistrationService.findById(
            request.getAnimalId());
        try {
            if (animal.isPresent()) {
                Animal foundAnimal = animal.get();
                AnimalRes responseAnimal = AnimalRes.newBuilder()
                    .setId(foundAnimal.getId())
                    .setWeight(foundAnimal.getWeight())
                    .setOrigin(foundAnimal.getOrigin())
                    .setType(foundAnimal.getType())
                    .build();
                responseObserver.onNext(responseAnimal);
                responseObserver.onCompleted();
            }else{
                throw new Exception("Animal not found");
            }
        }catch(Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override public void findByDate(DateRequest request,
        StreamObserver<AnimalListResponse> responseObserver)
    {
        List<Animal> animals = animalRegistrationService.findByDate(
            convertToLocalDate(request.getDate()));
        List<AnimalRes> animalsRes = new ArrayList<>();
        try {
            for(Animal a : animals) {
                animalsRes.add(AnimalRes.newBuilder()
                    .setId(a.getId())
                    .setType(a.getType())
                    .setOrigin(a.getOrigin())
                    .setWeight(a.getWeight())
                    .build());
            }

            AnimalListResponse response = AnimalListResponse.newBuilder()
                .addAllAnimals(animalsRes)
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }catch(Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override public void findByOrigin(OriginRequest request,
        StreamObserver<AnimalListResponse> responseObserver)
    {
        List<Animal> animals = animalRegistrationService.findByOrigin(
            request.getOrigin());
        List<AnimalRes> animalsRes = new ArrayList<>();
        try {
            for(Animal a : animals) {
                animalsRes.add(AnimalRes.newBuilder()
                    .setId(a.getId())
                    .setType(a.getType())
                    .setOrigin(a.getOrigin())
                    .setWeight(a.getWeight())
                    .build());
            }

            AnimalListResponse response = AnimalListResponse.newBuilder()
                .addAllAnimals(animalsRes)
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }catch(Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override public void getAnimalsByProduct(ProductRequest request,
        StreamObserver<AnimalListResponse> responseObserver)
    {
        List<Animal> animals = animalRegistrationService.findByProductId(
            request.getProductId());
        List<AnimalRes> animalsRes = new ArrayList<>();
        try {
            for(Animal a : animals) {
                animalsRes.add(AnimalRes.newBuilder()
                    .setId(a.getId())
                    .setType(a.getType())
                    .setOrigin(a.getOrigin())
                    .setWeight(a.getWeight())
                    .build());
            }

            AnimalListResponse response = AnimalListResponse.newBuilder()
                .addAllAnimals(animalsRes)
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }catch(Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override public void getProductsByAnimal(AnimalRequest request,
        StreamObserver<ProductListResponse> responseObserver)
    {
        List<Product> products = animalRegistrationService.findProductByAnimalId(
            request.getAnimalId());
        List<ProductRes> productsRes = new ArrayList<>();
        try {
            for(Product p : products) {
                productsRes.add(ProductRes.newBuilder()
                    .setId(p.getId())
                    .build());
            }

            ProductListResponse response = ProductListResponse.newBuilder()
                .addAllProducts(productsRes)
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }catch(Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }
}
