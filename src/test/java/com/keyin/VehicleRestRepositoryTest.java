package com.keyin;

import com.keyin.vehicle.Vehicle;
import com.keyin.vehicle.rest.VehicleRestRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class VehicleRestRepositoryTest {

    @Mock
    private VehicleRestRepository vehicleRestRepository;

    @Test
    @DisplayName("Finding vehicle by brand")
    public void testFindVehicleByBrand(){

        Vehicle car1 = new Vehicle();
        car1.setYear("2012");
        car1.setBrand("BMW");
        car1.setModel("128i");
        car1.setColour("black");
        car1.setVin("ABC123");
        car1.setCost("$15,000.00");
        car1.setCountry("Canada");
        car1.setCity("St Johns");
        car1.setAddress("13 WaterStreet Dr.");

        Vehicle car2 = new Vehicle();
        car1.setYear("2023");
        car1.setBrand("Ford");
        car1.setModel("F150");
        car1.setColour("blue");
        car1.setVin("DEF456");
        car1.setCost("$100,000.00");
        car1.setCountry("United States");
        car1.setCity("Dallas");
        car1.setAddress("17 FairWay Road");

        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(car1);
        vehicleList.add(car2);


    }
}
