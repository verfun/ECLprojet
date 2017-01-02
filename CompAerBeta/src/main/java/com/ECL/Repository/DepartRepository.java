package com.ECL.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Depart;

@Repository
public interface DepartRepository extends JpaRepository<Depart, Long>{

	@Query("from Depart d Where d.vol.aeroportDest.ville=?1 AND d.vol.aeroportOrig.ville.ville=?2")
	public abstract List<Depart> findVolsByDestinationAndOrigineCities(String villeDest,String villeOrigin);
	
	@Query("from Depart d Where d.vol.aeroportDest.ville=?1 AND d.vol.aeroportOrig.ville.ville=?2")
	public abstract List<Depart> findVolsByDestinationAndOrigineCities
	(String villeDest, String villeOrigin, Date date);
}
