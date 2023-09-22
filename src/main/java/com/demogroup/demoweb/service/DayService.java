package com.demogroup.demoweb.service;

import com.demogroup.demoweb.dto.DayDTO;
import com.demogroup.demoweb.dto.WordDTO;
import com.demogroup.demoweb.entity.DayEntity;
import com.demogroup.demoweb.entity.WordEntity;
import com.demogroup.demoweb.repository.DayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class DayService {
    private final DayRepository dayRepository;
    public List<DayDTO> getAllDays() {
        List<DayEntity> days = dayRepository.findAll();
        return days.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    public void saveDay(DayEntity dayEntity) {
        dayRepository.save(dayEntity);
    }
    private DayDTO convertToDTO(DayEntity day) {
        return new DayDTO(day.getId(), day.getDay());
    }

}
