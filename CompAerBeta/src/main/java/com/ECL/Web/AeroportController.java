package com.ECL.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ECL.Domain.Aeroport;
import com.ECL.Repository.AeroportRepository;
import com.ECL.Service.AeroportService;


@Controller
@RequestMapping("")
public class AeroportController {
	
	@Autowired
	private AeroportService aeroportService;
	
		
	@RequestMapping(value="/getAeroports")
	@ResponseBody
	public List<Aeroport> findAllAeroports() {
		return aeroportService.findAllAeroports();
	}
}
