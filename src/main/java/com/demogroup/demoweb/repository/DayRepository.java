package com.demogroup.demoweb.repository;

import com.demogroup.demoweb.entity.DayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends JpaRepository<DayEntity,Long>{


        }

