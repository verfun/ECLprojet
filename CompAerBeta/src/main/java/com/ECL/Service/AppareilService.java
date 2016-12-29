package com.ECL.Service;

import java.util.List;

import com.ECL.Domain.Appareil;

public interface AppareilService {
	
	public abstract void deleteAppareil(Appareil appareil);
	
	public abstract Appareil findAppareil(Long id);

	public abstract List<Appareil> findAllAppareils();

	public abstract Appareil saveAppareil(Appareil appareil);

	public abstract Appareil updateAppareil(Appareil appareil);
}
