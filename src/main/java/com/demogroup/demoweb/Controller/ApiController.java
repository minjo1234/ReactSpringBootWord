package com.demogroup.demoweb.Controller;

import com.demogroup.demoweb.entity.DayEntity;
import com.demogroup.demoweb.entity.WordEntity;
import com.demogroup.demoweb.service.DayService;
import com.demogroup.demoweb.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {
    private final DayService dayService;
    private final WordService wordService;

    // 일자 생성 API
    // 일자 생성 API
    @PostMapping("/days")
    public void saveDays(@RequestBody List<DayEntity> days) {
        for (DayEntity day : days) {
            dayService.saveDay(day); // DayService에서 일자를 저장하는 메서드를 구현해야 합니다.
            System.out.println("DayEntity =" + day);
        }
    }
    // 단어 생성 API
    // 단어 생성 API
    @PostMapping("/words")
    public void saveWords(@RequestBody List<WordEntity> words) {
        for (WordEntity word : words) {
            wordService.saveWord(word); // WordService에서 단어를 저장하는 메서드를 구현해야 합니다.
            System.out.println("word =" + word);
        }
    }
}