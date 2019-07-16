package com.foodorder.tableservice;

import com.foodorder.tableservice.model.Table;
import com.foodorder.tableservice.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TableServiceApplication {

    @Autowired
    private TableRepository tableRepository;

    @Bean
    CommandLineRunner preLoadMongo() {
        return args -> {
            tableRepository.save(new Table(1));
            tableRepository.save(new Table(2));
            tableRepository.save(new Table(3));
            tableRepository.save(new Table(4));
            tableRepository.save(new Table(5));
            tableRepository.save(new Table(6));
            tableRepository.save(new Table(7));
            tableRepository.save(new Table(8));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(TableServiceApplication.class, args);
    }

}
