package com.ECL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.TypeAppareil;

@Repository
public interface TypeAppareilRepository extends JpaRepository<TypeAppareil, Long> {

}
