package com.termproj.Flitey.repository;

import com.termproj.Flitey.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AircraftRepo extends JpaRepository<Aircraft,Integer> {
}
