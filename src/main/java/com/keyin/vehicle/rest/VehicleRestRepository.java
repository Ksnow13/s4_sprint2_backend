package com.keyin.vehicle.rest;

import com.keyin.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "vehicle", path = "vehicle")
public interface VehicleRestRepository extends JpaRepository<Vehicle, Long> {

    public List<Vehicle> findByBrand(@Param("brand")String airLine);

    //public List<Aircraft> findByType(@Param("type")String type);

    // this gets a list of aircraft's that can land/take off from an airport.

    //public List<Aircraft> findByAirports_name(@Param("airports_name")String airportName);

}
