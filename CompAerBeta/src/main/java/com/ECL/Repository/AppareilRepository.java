package com.ECL.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Appareil;
@Repository
public interface AppareilRepository extends JpaRepository<Appareil, Long> {

}
