package com.demo.webflux.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.demo.webflux.document.Playlist;

public interface PlaylistService {

    Flux<Playlist> findAll();
    Mono<Playlist> findById(String id);
    Mono<Playlist> save(Playlist playlist);
}
