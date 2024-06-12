package com.taller28.taller28.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "characters")
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @Column(length = 8, nullable = false)
    private String status;
    
    @Column(length = 45, nullable = false)
    private String created;
    
    @Column(length = 45, nullable = false)
    private String gender;
    
    @Column(length = 45, nullable = false)
    private String species;
    
    @Column(length = 100, nullable = false)
    private String img;
    
    @Column(length = 100, nullable = false)
    private String name;
    
    @Column(length = 100)
    private String url;
}
