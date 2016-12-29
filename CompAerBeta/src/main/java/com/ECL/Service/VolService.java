package com.ECL.Service;

import java.util.List;

import com.ECL.Domain.Vol;

public interface VolService {

	public abstract void deleteVol(Vol vol);
	
	public abstract Vol findVol(Long id);

	public abstract List<Vol> findAllVols();

	public abstract Vol saveVol(Vol vol);

	public abstract Vol updateVol(Vol vol);
	
	public abstract List<Vol> findVolsByDestinationAndOrigin(String villeDest,String villeOrig);
}
