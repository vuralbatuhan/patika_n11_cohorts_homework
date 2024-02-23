package com.example.House_hw_n11.core.utils;

import com.example.House_hw_n11.entity.abstracts.BaseEntity;
import com.example.House_hw_n11.entity.concrete.HouseEntity;
import com.example.House_hw_n11.entity.concrete.SummerHouseEntity;
import com.example.House_hw_n11.entity.concrete.VillaEntity;
import com.example.House_hw_n11.enums.Estate;
import lombok.Getter;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

public class DataAggr {

    @Getter
    @Singular
    private static final List<HouseEntity> houseList = new ArrayList<>();
    private static final List <VillaEntity> villaList = new ArrayList<>();
    private static final List<SummerHouseEntity> summerHouseList = new ArrayList<>();



    private static void dataAggr() {
        houseList.add(new HouseEntity(0,2000, 250,5,2, Estate.HOUSE));
        houseList.add(new HouseEntity(1,3000, 290,6,2, Estate.HOUSE));
        houseList.add(new HouseEntity(2,1000, 180,3,1, Estate.HOUSE));

        villaList.add(new VillaEntity(3,4000, 370,9,4, Estate.VILLA));
        villaList.add(new VillaEntity(4,4500, 400,8,4, Estate.VILLA));
        villaList.add(new VillaEntity(5,6000, 520,12,6, Estate.VILLA));

        summerHouseList.add(new SummerHouseEntity(6,2000, 240,4,1, Estate.SUMMER_HOUSE));
        summerHouseList.add(new SummerHouseEntity(7,1500, 180,3,1, Estate.SUMMER_HOUSE));
        summerHouseList.add(new SummerHouseEntity(8,2000, 220,4,1, Estate.SUMMER_HOUSE));

    }

    public  DataAggr() {
        dataAggr();
        getHouseList();
        getVillaList();
        getSummerHouseList();
    }

    public List getHouseList() {
        //System.out.println(houseList.toString());
        return houseList;
    }

    public List getVillaList() {
        //System.out.println(villaList.toString());
        return villaList;
    }

    public List getSummerHouseList() {
        //System.out.println(summerHouseList.toString());
        return summerHouseList;
    }

    public List getAllEstate() {
        List<BaseEntity> baseEntityList = new ArrayList<>();
        baseEntityList.addAll(houseList);
        baseEntityList.addAll(villaList);
        baseEntityList.addAll(summerHouseList);
        return baseEntityList;
    }
}
