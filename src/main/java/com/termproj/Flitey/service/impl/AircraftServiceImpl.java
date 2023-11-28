package com.termproj.Flitey.service.impl;

import com.termproj.Flitey.model.Aircraft;
import com.termproj.Flitey.repository.AircraftRepo;
import com.termproj.Flitey.service.AircraftService;

import java.util.List;

public class AircraftServiceImpl implements AircraftService {

    AircraftRepo aircraftRepo;
    public AircraftServiceImpl(AircraftRepo aircraftRepo) {
        this.aircraftRepo = aircraftRepo;
    }


    @Override
    public String createAircraft(Aircraft aircraft) {
        aircraftRepo.save(aircraft);

        return("Aircraft succesfully saved");
    }

    @Override
    public Aircraft getAircraft(int aircraftId) {
        return aircraftRepo.findById(aircraftId).get();
    }

    @Override
    public Aircraft updateAircraft(int aircraftId) {
        return null;
    }

    @Override
    public List<Aircraft> getAllAircrafts() {

        return aircraftRepo.findAll();
    }
}
