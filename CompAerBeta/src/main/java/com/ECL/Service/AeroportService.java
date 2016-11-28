package com.ECL.Service;

import java.util.List;



import com.ECL.Domain.Aeroport;


public interface AeroportService {
	
	public abstract void deleteAeroport(Aeroport Aeroport);
	
	public abstract Aeroport findAeroport(Long id);

	public abstract List<Aeroport> findAllAeroports();

	public abstract Aeroport saveAeroport(Aeroport Aeroport);

	public abstract Aeroport updateAeroport(Aeroport Aeroport);
	
	public abstract List<Aeroport> findAllAeroportByVille(String msn);

	public abstract Aeroport getGreatestAeroportId();

}
