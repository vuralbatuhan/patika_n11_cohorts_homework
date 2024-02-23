package com.example.House_hw_n11.services.abstracts;

import com.example.House_hw_n11.entity.abstracts.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public interface EstateService {

    double getSumOfPrice(List<BaseEntity> baseEntityList);
    double getSumOfArea(List<BaseEntity> baseEntityList);
    List<BaseEntity> sortedByRoom(List<BaseEntity> baseEntityList);

}
