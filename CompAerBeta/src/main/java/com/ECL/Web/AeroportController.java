package com.ECL.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ECL.Domain.Aeroport;
import com.ECL.Service.AeroportService;


@RestController
public class AeroportController {
	
	@Autowired
	private AeroportService aeroportService;
	
		
	@RequestMapping(value="/getAeroports")
	@ResponseBody
	public List<Aeroport> findAllAeroports() {
		return aeroportService.findAllAeroports();
	}
	
	
	@RequestMapping(value="/addAeroport", method = RequestMethod.POST)
	public void saveAeroports(@RequestBody Aeroport aeroport){
		aeroportService.saveAeroport(aeroport);
	}
	
	@RequestMapping(value="/deleteAeroport/{id}", method = RequestMethod.DELETE)
	public void deleteAeroports(@PathVariable("id") Long id){
		aeroportService.deleteAeroport(id);
	}
	
}
