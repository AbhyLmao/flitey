package com.termproj.Flitey.repository;

import com.termproj.Flitey.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flight,Integer> {
}
