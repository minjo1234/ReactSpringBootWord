package com.demogroup.demoweb.Controller;

import com.demogroup.demoweb.dto.WordDTO;
import com.demogroup.demoweb.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/words") // API 엔드포인트 경로 수정
@RequiredArgsConstructor
public class WordController {
    private final WordService wordService;

    @GetMapping
    public List<WordDTO> getAllWords() {
        return wordService.getAllWords(); // wordService.getAllWords()로 수정
    }
}
