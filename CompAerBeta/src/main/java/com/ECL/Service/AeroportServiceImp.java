package com.ECL.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ECL.Domain.Aeroport;
import com.ECL.Repository.AeroportRepository;

@Service
@Transactional
public class AeroportServiceImp implements AeroportService {
	
	@Autowired
	private AeroportRepository aeroportRepository;

	@Override
	public void deleteAeroport(Aeroport aeroport) {
		aeroportRepository.delete(aeroport);
	}

	@Override
	public Aeroport findAeroport(Long id) {
		return aeroportRepository.findOne(id);
	}

	@Override
	public List<Aeroport> findAllAeroports() {
		return aeroportRepository.findAll();
	}

	@Override
	public Aeroport saveAeroport(Aeroport aeroport) {
		return aeroportRepository.save(aeroport);
	}

	@Override
	public Aeroport updateAeroport(Aeroport aeroport) {
		return aeroportRepository.save(aeroport);
	}

	@Override
	public void deleteAeroport(Long id) {
		 aeroportRepository.delete(id);;
	}
	@Override
	public List<Aeroport> findAllAeroportByVille(String msn) {
		// TO custmise
		return null;
	}

	@Override
	public Aeroport getGreatestAeroportId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
