package com.demo.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.demo.webflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {
}
