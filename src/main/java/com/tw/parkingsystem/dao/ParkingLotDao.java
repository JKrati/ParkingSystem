package com.tw.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tw.parkingsystem.models.ParkingLot;

public interface ParkingLotDao extends JpaRepository<ParkingLot, Long> {

}
