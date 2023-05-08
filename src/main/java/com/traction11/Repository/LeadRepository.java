package com.traction11.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traction11.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
