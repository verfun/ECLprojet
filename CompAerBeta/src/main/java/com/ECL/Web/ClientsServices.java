package com.ECL.Web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ECL.Domain.Depart;
import com.ECL.Service.DepartService;

@RestController
public class ClientsServices {
	
	@Autowired
	private DepartService departService;
	
	@RequestMapping(value="/searchDeparts/{dest}/{orig}",method=RequestMethod.GET)
	@ResponseBody
	public List<Depart> getVolsByDestAndOrig(@PathVariable("dest") String dest ,@PathVariable("orig") String orig){
		List<Depart> departs = departService.findDeparsByDestinationAndOrigineCities(dest, orig);	
		return departs;
	}
	
	@RequestMapping(value="/getNbrOfFreePlaces",method=RequestMethod.GET)
	@ResponseBody
	public Integer getNbrOfFreePlaces(){
		return 0;
	}

}
