package com.example.House_hw_n11.entity.concrete;

import com.example.House_hw_n11.entity.abstracts.BaseEntity;
import com.example.House_hw_n11.enums.Estate;

public class HouseEntity extends BaseEntity {
    public HouseEntity(int id, double price, double area, int room, int livingRoom, Estate estate) {
        super(id, price, area, room, livingRoom, estate);
    }
}
