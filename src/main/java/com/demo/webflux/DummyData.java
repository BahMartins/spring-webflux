package com.demo.webflux;

import reactor.core.publisher.Flux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.webflux.document.Playlist;
import com.demo.webflux.repository.PlaylistRepository;

/*@Component
public class DummyData implements CommandLineRunner {

    private final PlaylistRepository playlistRepository;

    DummyData(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        playlistRepository.deleteAll()
                .thenMany(
                        Flux.just(
                                "API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud",
                                "Java 8", "GitHub", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework"
                        ).map(name -> new Playlist(UUID.randomUUID().toString(), name))
                         .flatMap(playlistRepository::save))
                .subscribe(System.out::println);
    }
}*/
