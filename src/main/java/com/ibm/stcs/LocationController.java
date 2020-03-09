package com.ibm.stcs;
	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.stcs.domain.GCCStates;
import com.ibm.stcs.domain.Panorama;
import com.ibm.stcs.domain.Person;
import com.ibm.stcs.serivce.LocationService;


	@CrossOrigin
	@RestController
	@RequestMapping("/all")
	public class LocationController {
		
		@Autowired
		private LocationService locSer;	   

	    @GetMapping(path="/", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<GCCStates> all() {

	    	return locSer.getGCCStates();
	       
	    }


	    @GetMapping(path="/getGCCStates", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<GCCStates> gCCStates() {
	    	
	        return locSer.createGCCStates();
	    }
	    
	    @GetMapping(path="/getGCCStatesByLatLog/{latitude}/{logitude}",produces = MediaType.APPLICATION_JSON_VALUE)
	    public GCCStates getGCCStatesByLatLog(@PathVariable String latitude, @PathVariable String logitude) {
	    	
	    	return locSer.getGCCStatesByLatLog(latitude, logitude);
	    }
	    
	    @GetMapping(path="/getPanoramaData", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Panorama> getPanoramaData() {
	   
	    	return locSer.getPanoramaData();  	
	    	
	    }
	    
	    @GetMapping(path="/getPanoramaDataByLatLog", produces = MediaType.APPLICATION_JSON_VALUE)
	    public Panorama getPanoramaByLatLog(@PathVariable String latitude, @PathVariable String logitude) {
	    	
	    	return locSer.getPanoramaByLatLog(latitude,logitude);
	    }
	    
	    @GetMapping(path="/getPerson", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Person> getPerson() {
	    	
	    	
	    	return locSer.getPersonData();
	    }
	    
	     
	    
	    @GetMapping(path="/getContactDetails/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	    public List<Person> getContactDetails(@PathVariable Integer id){
	    	return locSer.getContactDetails(id);
	    	
	    }
	    
	   
	}


