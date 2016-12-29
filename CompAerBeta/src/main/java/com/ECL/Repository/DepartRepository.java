package com.ECL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Depart;

@Repository
public interface DepartRepository extends JpaRepository<Depart, Long>{

}
