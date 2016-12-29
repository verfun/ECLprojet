package com.ECL;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ECL.Domain.Aeroport;
import com.ECL.Domain.EmployeeNav;
import com.ECL.Domain.Licence;
import com.ECL.Domain.Pilote;
import com.ECL.Repository.AeroportRepository;
import com.ECL.Repository.EmployeeRepository;

@SpringBootApplication
public class CompAerBetaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CompAerBetaApplication.class, args);
		
		AeroportRepository aeRepository = ctx.getBean(AeroportRepository.class);
		aeRepository.save(new Aeroport("casablanca","MD5","casablanca"));
		aeRepository.save(new Aeroport("lyon","LYS","lyon"));
		aeRepository.save(new Aeroport("london","LDN","london"));
		EmployeeRepository emRepository = ctx.getBean(EmployeeRepository.class);
		emRepository.save(new EmployeeNav("celen","garcia",new Date()
				,"00341","hotesse",0));
		emRepository.save(new Pilote("Rizki","Lahcen",new Date()
				,"00341",0,new Licence("2301")));
		aeRepository.findAll().forEach(p->System.out.println("aeroport "+p.getName()+" => "+p.getCode()));
		

	}
}
