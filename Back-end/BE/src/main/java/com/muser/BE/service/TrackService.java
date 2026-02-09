package com.muser.BE.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.muser.BE.dto.TrackDTO;
import com.muser.BE.entity.Track;
import com.muser.BE.repository.TrackRepository;

@Service
public class TrackService {

    private final TrackRepository repo;

    public TrackService(TrackRepository repo) {
        this.repo = repo;
    }

    // Ritorna tutti i brani
    public List<TrackDTO> getAllTracks() {
        return repo.findAll().stream()
                   .map(this::toDTO)
                   .toList();
    }

    // Discovery con filtri opzionali
    public List<TrackDTO> discover(String mood, Integer energy) {
        List<Track> tracks;
        
        if (mood != null && energy != null) {
            tracks = repo.findByMoodAndEnergy(mood, energy);
        } else if (mood != null) {
            tracks = repo.findByMood(mood);
        } else if (energy != null) {
            tracks = repo.findByEnergy(energy);
        } else {
            tracks = repo.findAll();
        }
        
        return tracks.stream()
                     .map(this::toDTO)
                     .toList();
    }

    // Mapping Track → TrackDTO
    private TrackDTO toDTO(Track track) {
        return new TrackDTO(
            track.getId(),
            track.getTitle(),
            track.getArtist(),
            track.getMood(),
            track.getEnergy(),
            track.getAudioUrl()
        );
    }
}