package com.foodorder.tableservice.repository;

import com.foodorder.tableservice.model.Table;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends MongoRepository<Table, String> {

    boolean existsByNumber(int number);
}
