package com.demo.webflux.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document //faz o mapeamento objeto -> dados
@AllArgsConstructor
@NoArgsConstructor
public class Playlist {
    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

}
