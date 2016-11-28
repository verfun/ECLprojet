package com.ECL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Aeroport;


@Repository
public interface AeroportRepository extends JpaRepository<Aeroport, Long>{

}
