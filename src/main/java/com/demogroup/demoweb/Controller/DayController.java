package com.demogroup.demoweb.Controller;

import com.demogroup.demoweb.dto.DayDTO;
import com.demogroup.demoweb.service.DayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/days")
@RequiredArgsConstructor
public class DayController {
    private final DayService dayService;
    @GetMapping
    public List<DayDTO> getAllDays() {
        return dayService.getAllDays();
    }


    // Day 엔티티와 관련된 API 엔드포인트를 정의합니다.
}