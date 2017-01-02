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
		
		
		

	}
}
