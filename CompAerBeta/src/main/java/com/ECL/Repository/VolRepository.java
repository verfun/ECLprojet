package com.ECL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Vol;

@Repository
public interface VolRepository extends JpaRepository<Vol, Long> {

}
