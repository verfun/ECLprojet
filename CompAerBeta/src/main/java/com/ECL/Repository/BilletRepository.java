package com.ECL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Billet;

@Repository
public interface BilletRepository extends JpaRepository<Billet, Long> {

}
