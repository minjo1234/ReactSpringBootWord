package com.demogroup.demoweb.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WordDTO {
    private Long id;
    private String eng;
    private String kor;
    private boolean day;
}