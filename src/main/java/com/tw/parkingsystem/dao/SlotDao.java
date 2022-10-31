package com.tw.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tw.parkingsystem.models.Slot;

public interface SlotDao extends JpaRepository<Slot, Long> {

}
