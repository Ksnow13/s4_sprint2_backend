package com.keyin.vehicle.rest;

import com.keyin.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "vehicle", path = "vehicle")
public interface VehicleRestRepository extends JpaRepository<Vehicle, Long> {

    public List<Vehicle> findByBrand(@Param("brand")String brand);

    public List<Vehicle> findByModel(@Param("model")String model);


}
