package com.demogroup.demoweb.service;

import com.demogroup.demoweb.dto.WordDTO;
import com.demogroup.demoweb.entity.WordEntity;
import com.demogroup.demoweb.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WordService {
    private final WordRepository wordRepository;

    public List<WordDTO> getAllWords() {
        List<WordEntity> words = wordRepository.findAll();
        return words.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    public void saveWord(WordEntity wordEntity) {
        wordRepository.save(wordEntity);
    }
    private WordDTO convertToDTO(WordEntity word) {
        return new WordDTO(word.getId(), word.getEng(), word.getKor(), word.isDone()); // isDone()로 수정
    }
}
