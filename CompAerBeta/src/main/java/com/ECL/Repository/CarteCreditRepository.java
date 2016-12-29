package com.ECL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.CarteCredit;

@Repository
public interface CarteCreditRepository extends JpaRepository<CarteCredit, Long>{

}
