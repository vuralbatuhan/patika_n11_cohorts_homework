package com.example.House_hw_n11.services.concrete;

import com.example.House_hw_n11.entity.abstracts.BaseEntity;
import com.example.House_hw_n11.services.abstracts.EstateService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EstateServiceImpl implements EstateService {


    @Override
    public double getSumOfPrice(List<BaseEntity> baseEntityList) {
        double sumPrice = 0;
        for(BaseEntity element : baseEntityList) {
            sumPrice += element.getPrice();
        }
        return sumPrice;
    }

    @Override
    public double getSumOfArea(List<BaseEntity> baseEntityList) {
        double sumArea = 0;
        for(BaseEntity element : baseEntityList) {
            sumArea += element.getArea();
        }
        return sumArea / baseEntityList.size();
    }

    @Override
    public List<BaseEntity> sortedByRoom(List<BaseEntity> baseEntityList) {
        Collections.sort(baseEntityList, new Comparator<BaseEntity>() {
            public int compare(BaseEntity c1, BaseEntity c2) {
                if (c1.getRoom()+c1.getLivingRoom() > c2.getRoom()+c2.getLivingRoom()) return -1;
                if (c1.getRoom()+c1.getLivingRoom() < c2.getRoom()+c2.getLivingRoom()) return 1;
                return 0;
            }});
        return baseEntityList;
    }

}
