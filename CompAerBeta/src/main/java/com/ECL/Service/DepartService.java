package com.ECL.Service;

import java.util.Date;
import java.util.List;

import com.ECL.Domain.Depart;

public interface DepartService {

	public abstract void deleteDepart(Depart depart);
	
	public abstract Depart findDepart(Long id);

	public abstract List<Depart> findAllDeparts();

	public abstract Depart saveDepart(Depart depart);

	public abstract Depart updateDepart(Depart depart);

	List<Depart> findDeparsByDestinationAndOrigineCities(String villeDest, String villeOrigin);

	List<Depart> findDeparsByDestinationAndOrigineCities(String villeDest, String villeOrigin, Date date);
}
