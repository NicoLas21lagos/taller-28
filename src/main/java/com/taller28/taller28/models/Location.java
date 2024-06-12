package com.taller28.taller28.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "location")
public class Location {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false)
    private Integer dimension;
    
    @Column(length = 45, nullable = false)
    private String created;
    
    @Column(length = 45, nullable = false)
    private String type;
    
    @Column(length = 100, nullable = false)
    private String name;
    
    @Column(name = "residents_length", length = 100)
    private String residentsLength;
    
    @Column(length = 100)
    private String url;
}
