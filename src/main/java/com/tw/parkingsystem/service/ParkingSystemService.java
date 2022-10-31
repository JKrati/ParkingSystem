package com.tw.parkingsystem.service;

import java.util.List;
import java.util.Optional;

import com.tw.parkingsystem.models.Gate;
import com.tw.parkingsystem.models.ParkingLot;
import com.tw.parkingsystem.models.Slot;
import com.tw.parkingsystem.models.Vehicle;
import com.tw.parkingsystem.models.VehicleEntry;

public interface ParkingSystemService {

	void saveParkingLot(ParkingLot parkingLot);

	Optional<ParkingLot> getParkingLot();

	Optional<Slot> getSlot(Long id);

	Optional<Gate> getGate(Long id);

	void saveVehicleEntryFlow(Vehicle vehicle, Gate gate, Slot slot);

	void saveVehicleExitFlow(Vehicle vehicle, Gate gate, Slot slot, Short amount);

	Optional<List<VehicleEntry>> getAllVehicleEntries();
}
