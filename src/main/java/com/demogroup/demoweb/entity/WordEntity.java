package com.demogroup.demoweb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "word_table")
public class WordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Integer day;
    @Column
    private String eng;
    @Column
    private String kor;
    @Column
    private boolean isDone; // boolean 타입으로 변경

    @ManyToOne
    @JoinColumn(name = "day_id")
    private DayEntity dayEntity;




}
