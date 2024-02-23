package com.example.House_hw_n11;

import com.example.House_hw_n11.core.utils.DataAggr;
import com.example.House_hw_n11.services.concrete.EstateServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HouseHwN11Application {

	public static void main(String[] args) {
		SpringApplication.run(HouseHwN11Application.class, args);
		DataAggr dataAggr = new DataAggr();
		EstateServiceImpl estateServiceImpl = new EstateServiceImpl();
		System.out.println("Sum of hous price = " + estateServiceImpl.getSumOfPrice(dataAggr.getHouseList()));
		System.out.println("Sum of villa price = " + estateServiceImpl.getSumOfPrice(dataAggr.getVillaList()));
		System.out.println("Sum of summerHouse price = " + estateServiceImpl.getSumOfPrice(dataAggr.getSummerHouseList()));
		System.out.println("Sum of all estate price = " + estateServiceImpl.getSumOfPrice(dataAggr.getAllEstate()));

		System.out.println("***************************************************************************************************");

		System.out.println("Average of house area = " + estateServiceImpl.getSumOfArea(dataAggr.getHouseList()));
		System.out.println("Average of villa area = " + estateServiceImpl.getSumOfArea(dataAggr.getVillaList()));
		System.out.println("Average of summerHouse area = " + estateServiceImpl.getSumOfArea(dataAggr.getSummerHouseList()));
		System.out.println("Average of all estate area = " + estateServiceImpl.getSumOfArea(dataAggr.getAllEstate()));

		System.out.println("***************************************************************************************************");

		System.out.println("Sorting from biggest to smallest according to room and living room for house = " + estateServiceImpl.sortedByRoom(dataAggr.getHouseList()));
		System.out.println("Sorting from biggest to smallest according to room and living room for villa = " + estateServiceImpl.sortedByRoom(dataAggr.getVillaList()));
		System.out.println("Sorting from biggest to smallest according to room and living room for summerHouse = " + estateServiceImpl.sortedByRoom(dataAggr.getSummerHouseList()));
	}

}
