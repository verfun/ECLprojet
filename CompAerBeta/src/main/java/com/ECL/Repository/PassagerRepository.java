package com.ECL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Passager;
@Repository
public interface PassagerRepository extends JpaRepository<Passager, Long>{

}
