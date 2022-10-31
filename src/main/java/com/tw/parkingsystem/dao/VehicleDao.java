package com.tw.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tw.parkingsystem.models.Vehicle;

public interface VehicleDao extends JpaRepository<Vehicle, Long> {

}
