package com.tw.parkingsystem.dao;

import com.tw.parkingsystem.models.VehicleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleInfoDao extends JpaRepository<VehicleInfo, Long> {

}
