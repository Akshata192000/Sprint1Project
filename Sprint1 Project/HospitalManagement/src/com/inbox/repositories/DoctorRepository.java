package com.inbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inbox.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}