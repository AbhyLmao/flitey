package com.termproj.Flitey.service;

import com.termproj.Flitey.model.Aircraft;


import java.util.List;

public interface AircraftService {
    public String createAircraft(Aircraft aircraft);

    public Aircraft getAircraft(int aircraftId);

    public Aircraft updateAircraft(int aircraftId);

    public List<Aircraft> getAllAircrafts();


}
