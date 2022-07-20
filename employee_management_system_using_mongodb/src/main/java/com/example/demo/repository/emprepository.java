package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.employee;

public interface emprepository extends MongoRepository<employee, Integer> {

}
