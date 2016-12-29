package com.ECL.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ECL.Domain.Vol;
import com.ECL.Repository.VolRepository;

@Service
@Transactional
public class VolServiceImp implements VolService{

	@Autowired
	VolRepository volRepository;
	
	@Override
	public void deleteVol(Vol vol) {
		volRepository.delete(vol);
	}

	@Override
	public Vol findVol(Long id) {
		return volRepository.findOne(id);
	}

	@Override
	public List<Vol> findAllVols() {
		return volRepository.findAll();
	}

	@Override
	public Vol saveVol(Vol vol) {
		return volRepository.save(vol);
	}

	@Override
	public Vol updateVol(Vol vol) {
		return volRepository.save(vol);
	}

	@Override
	public List<Vol> findVolsByDestinationAndOrigin(String villeDest, String villeOrigin) {
		return volRepository
				.findVolsByDestinationAndOrigineCities(villeDest, villeOrigin);
	}

	

}
