package com.muser.BE.loader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.muser.BE.entity.Track;
import com.muser.BE.repository.TrackRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final TrackRepository repo;

    public DataLoader(TrackRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        // Pulisce DB ad ogni avvio
        repo.deleteAll();
        
        // Popola con dati di test
        repo.save(new Track(null, "Night Flow", "Lume", "night", 2, "/audio/1.mp3"));
        repo.save(new Track(null, "Deep Focus", "Neuron", "focus", 3, "/audio/2.mp3"));
        repo.save(new Track(null, "Energy Pulse", "Volt", "energy", 5, "/audio/3.mp3"));
        repo.save(new Track(null, "Chill Vibes", "Echo", "chill", 2, "/audio/4.mp3"));
        repo.save(new Track(null, "Study Mode", "Syntaxis", "focus", 4, "/audio/5.mp3"));
        repo.save(new Track(null, "Midnight Drive", "Nyx", "night", 3, "/audio/6.mp3"));
        repo.save(new Track(null, "Morning Energy", "Surge", "energy", 4, "/audio/7.mp3"));
        repo.save(new Track(null, "Lazy Sunday", "Float", "chill", 1, "/audio/8.mp3"));
        repo.save(new Track(null, "Focus Flow", "Mindset", "focus", 5, "/audio/9.mp3"));
        repo.save(new Track(null, "Night Rider", "Shadow", "night", 4, "/audio/10.mp3"));
        
        System.out.println("✅ Database popolato con " + repo.count() + " tracce");
    }
}