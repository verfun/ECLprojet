package com.ECL.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ECL.Domain.Depart;
import com.ECL.Repository.DepartRepository;

@Service
@Transactional
public class DepartServiceImp implements DepartService{

	@Autowired
	private DepartRepository departRepository;
	
	@Override
	public void deleteDepart(Depart depart) {
		departRepository.delete(depart);
	}

	@Override
	public Depart findDepart(Long id) {
		return departRepository.findOne(id);
	}

	@Override
	public List<Depart> findAllDeparts() {
		return departRepository.findAll();
	}

	@Override
	public Depart saveDepart(Depart depart) {
		return departRepository.save(depart);
	}

	@Override
	public Depart updateDepart(Depart depart) {
		return departRepository.save(depart);
	}
	@Override
	public List<Depart> findDeparsByDestinationAndOrigineCities
	(String villeDest,String villeOrigin){
		return departRepository
				.findVolsByDestinationAndOrigineCities(villeDest, villeOrigin);
	}
	@Override
	public List<Depart> findDeparsByDestinationAndOrigineCities
	(String villeDest,String villeOrigin,Date date){
		return departRepository
				.findVolsByDestinationAndOrigineCities(villeDest, villeOrigin,date);
	}

}
