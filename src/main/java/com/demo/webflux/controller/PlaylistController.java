package com.demo.webflux.controller;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.webflux.document.Playlist;
import com.demo.webflux.service.PlaylistService;

@RestController
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;


    @GetMapping(value = "/playlist")
    public Flux<Playlist> getPlaylists(){
        return playlistService.findAll();
    }

    @GetMapping(value = "/playlist/{id}")
    public Mono<Playlist> getPlaylist(@PathVariable String id){
        return playlistService.findById(id);
    }

    @PostMapping("/playlist")
    public Mono<Playlist> save(@RequestBody Playlist playlist){
        return playlistService.save(playlist);
    }

    @GetMapping(value = "/playlist/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tuple2<Long, Playlist>> getPlaylistByEvents() {

        Flux<Long> interval = Flux.interval(Duration.ofSeconds(10));
        Flux<Playlist> events = playlistService.findAll();

        return Flux.zip(interval, events);
    }

}
