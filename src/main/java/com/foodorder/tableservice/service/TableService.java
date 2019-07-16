package com.foodorder.tableservice.service;

import com.foodorder.tableservice.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService {

    @Autowired
    private TableRepository tableRepository;

    public boolean checkIfTableExist(int tableNumber) {
        return tableRepository.existsByNumber(tableNumber);
    }
}
