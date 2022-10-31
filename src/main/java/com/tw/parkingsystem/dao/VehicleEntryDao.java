package com.tw.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tw.parkingsystem.models.VehicleEntry;

public interface VehicleEntryDao extends JpaRepository<VehicleEntry, Long> {

}
