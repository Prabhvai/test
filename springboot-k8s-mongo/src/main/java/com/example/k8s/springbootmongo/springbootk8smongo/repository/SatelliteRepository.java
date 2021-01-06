package com.example.k8s.springbootmongo.springbootk8smongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.k8s.springbootmongo.springbootk8smongo.entity.Satellite;

public interface SatelliteRepository extends MongoRepository<Satellite, Long>{

}
