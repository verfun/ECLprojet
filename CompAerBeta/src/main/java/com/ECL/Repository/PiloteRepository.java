package com.ECL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Pilote;

@Repository
public interface PiloteRepository extends JpaRepository<Pilote, Long> {

}
