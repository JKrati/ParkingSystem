package com.tw.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tw.parkingsystem.models.Gate;

public interface GateDao extends JpaRepository<Gate, Long> {

}
