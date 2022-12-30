package com.api.parkingcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.parkingcontrol.models.ParkingSpotModel;

import java.util.UUID;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>  {
    
}
