package com.foodorder.tableservice.controller;

import com.foodorder.tableservice.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {

    @Autowired
    private TableService tableService;

    @GetMapping(value = "/tables/{number}")
    public ResponseEntity<Boolean> checkIfTableExist(@PathVariable int number) {
        return new ResponseEntity<>(tableService.checkIfTableExist(number), HttpStatus.OK);
    }
}
