package com.ECL.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Vol;

@Repository
public interface VolRepository extends JpaRepository<Vol, Long> {

	@Query("from Vol v Where v.aeroportDest.ville=?1 AND v.aeroportOrig.ville.ville=?2")
	public abstract List<Vol> findVolsByDestinationAndOrigineCities(String villeDest,String villeOrigin);

}
