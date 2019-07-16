package com.foodorder.tableservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document("table")
public class Table {

    @Id
    private String id;
    private int number;

    public Table(int number) {
        this.number = number;
    }

}
