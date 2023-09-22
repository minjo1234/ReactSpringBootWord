package com.demogroup.demoweb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name= "day_table")
public class DayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Integer day;

    @OneToMany(mappedBy = "dayEntity", cascade = CascadeType.ALL)
    private List<WordEntity> words;

}
