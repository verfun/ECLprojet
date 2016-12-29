package com.ECL.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECL.Domain.Appareil;
import com.ECL.Repository.AppareilRepository;

@Service
@Transactional
public class AppareilServiceImp implements AppareilService{

	@Autowired
	private AppareilRepository appareilRepository;
	
	@Override
	public void deleteAppareil(Appareil appareil) {
		appareilRepository.delete(appareil);
	}

	@Override
	public Appareil findAppareil(Long id) {
		return appareilRepository.findOne(id);
	}

	@Override
	public List<Appareil> findAllAppareils() {
		return appareilRepository.findAll();
	}

	@Override
	public Appareil saveAppareil(Appareil appareil) {
		return appareilRepository.save(appareil);
	}

	@Override
	public Appareil updateAppareil(Appareil appareil) {
		return appareilRepository.save(appareil);
	}

}
