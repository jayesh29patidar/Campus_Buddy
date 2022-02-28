package com.campusbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbuddy.model.TimeTable;

public interface TimeTableRepository extends JpaRepository<TimeTable, Long>{

}
