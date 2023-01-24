package com.inbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inbox.entities.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long>{

}