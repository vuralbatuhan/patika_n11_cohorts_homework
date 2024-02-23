package com.example.House_hw_n11.entity.abstracts;

import com.example.House_hw_n11.enums.Estate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class BaseEntity {

    protected int id;

    protected double price;

    protected double area;

    protected int room;

    protected int livingRoom;

    protected Estate estate;
}
