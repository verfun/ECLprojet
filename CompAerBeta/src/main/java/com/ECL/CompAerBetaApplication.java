package com.ECL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ECL.Domain.Aeroport;
import com.ECL.Repository.AeroportRepository;

@SpringBootApplication
public class CompAerBetaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CompAerBetaApplication.class, args);
		
		AeroportRepository aeRepository = ctx.getBean(AeroportRepository.class);
		aeRepository.save(new Aeroport("casablanca","MD5"));
		aeRepository.save(new Aeroport("lyon","LYS"));
		aeRepository.save(new Aeroport("london","LDN"));
		
		
		aeRepository.findAll().forEach(p->System.out.println("aeroport "+p.getName()+" => "+p.getCode()));
		

	}
}
