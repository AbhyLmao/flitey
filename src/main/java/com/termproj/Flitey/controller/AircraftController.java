package com.termproj.Flitey.controller;


import com.termproj.Flitey.model.Aircraft;
import com.termproj.Flitey.service.AircraftService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Aircraft")
public class AircraftController {

    AircraftService aircraftService;

    @GetMapping("{aircraftId}")
    public Aircraft getAircraftInfo(@PathVariable("aircraftId") int aircraftId){
        return aircraftService.getUser(aircraftId);
    }

    @GetMapping
    public List<Aircraft> getAllAircrafts(){
        return aircraftService.getAllUsers();
    }

    @PostMapping
    public String createAircraftInfo(@RequestBody Aircraft aircraft){
        aircraftService.createUser(aircraft);
        return "created user succesfully";
    }


}
