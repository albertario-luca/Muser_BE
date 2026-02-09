package com.muser.BE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;
    private String mood;      // chill, focus, energy, night
    private int energy;       // 1–5
    private String audioUrl;  // percorso file audio

    // Costruttore vuoto (richiesto da JPA)
    public Track() {
    }

    // Costruttore completo (per DataLoader e test)
    public Track(Long id, String title, String artist, String mood, int energy, String audioUrl) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.mood = mood;
        this.energy = energy;
        this.audioUrl = audioUrl;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }
}