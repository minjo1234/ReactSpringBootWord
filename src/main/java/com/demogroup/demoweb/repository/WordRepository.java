package com.demogroup.demoweb.repository;

import com.demogroup.demoweb.entity.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordRepository extends JpaRepository<WordEntity, Long> {
    // 추가적인 쿼리 메서드가 필요한 경우 정의합니다.
}

