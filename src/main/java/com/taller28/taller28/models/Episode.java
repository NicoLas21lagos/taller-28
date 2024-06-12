package com.taller28.taller28.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "episode")
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 45, nullable = false)
    private String airDate;
    
    @Column(length = 45, nullable = false)
    private String episode;
    
    @Column(length = 100, nullable = false)
    private String characters;
    
    @Column(length = 100, nullable = false)
    private String created;
    
    @Column(length = 100, nullable = false)
    private String name;
    
    @Column(length = 100)
    private String url;
    
    @ManyToMany
    @JoinTable(
        name = "characters_episode",
        joinColumns = @JoinColumn(name = "episode_id"),
        inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private Set<Character> charactersSet;
}
