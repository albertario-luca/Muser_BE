package com.muser.BE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muser.BE.entity.Track;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {

    // Query methods per filtri discovery
    List<Track> findByMood(String mood);
    
    List<Track> findByEnergy(int energy);
    
    List<Track> findByMoodAndEnergy(String mood, int energy);
    
    // Opzionale: ricerca per artista
    List<Track> findByArtistContainingIgnoreCase(String artist);
    
    // Opzionale: ricerca per titolo
    List<Track> findByTitleContainingIgnoreCase(String title);
}