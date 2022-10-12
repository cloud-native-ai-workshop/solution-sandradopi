package com.ibm.inventory_management.repositories;

import com.ibm.inventory_management.models.From;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FromRepository extends MongoRepository<From, String> {
}