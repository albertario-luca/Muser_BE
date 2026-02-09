package com.muser.BE.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.muser.BE.dto.TrackDTO;
import com.muser.BE.service.TrackService;

@RestController
@RequestMapping("/api/tracks")
@CrossOrigin(origins = "http://localhost:4200")
public class TrackController {

    private final TrackService service;

    public TrackController(TrackService service) {
        this.service = service;
    }

    // GET /api/tracks - Tutti i brani
    @GetMapping
    public List<TrackDTO> getAllTracks() {
        return service.getAllTracks();
    }

    // GET /api/tracks/discover?mood=chill&energy=3
    @GetMapping("/discover")
    public List<TrackDTO> discover(
        @RequestParam(required = false) String mood,
        @RequestParam(required = false) Integer energy
    ) {
        return service.discover(mood, energy);
    }
}