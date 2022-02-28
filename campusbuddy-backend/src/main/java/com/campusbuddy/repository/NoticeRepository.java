package com.campusbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbuddy.model.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long>{

}
