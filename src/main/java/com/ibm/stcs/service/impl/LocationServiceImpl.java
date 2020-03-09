package com.ibm.stcs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.stcs.domain.GCCStates;
import com.ibm.stcs.domain.GccStatesRepository;
import com.ibm.stcs.domain.Panorama;
import com.ibm.stcs.domain.PanoramaRepository;
import com.ibm.stcs.domain.Person;
import com.ibm.stcs.domain.PersonRepository;
import com.ibm.stcs.serivce.LocationService;

@Service
public class LocationServiceImpl implements LocationService{
	@Autowired
    private GccStatesRepository gccStatesRepository;
	
	@Autowired
	private PanoramaRepository panoramaRepository;
	
	@Autowired
	private PersonRepository personRepository;
	
	
	public List<GCCStates> createGCCStates() {
		List<GCCStates> gccStatesList = new ArrayList<GCCStates>();
    	GCCStates gCCStates = new GCCStates();
    	
    	//first
    	gCCStates.setId(1);
    	gCCStates.setProvince("United Arab Emirates");
    	gCCStates.setRegion("United Arab Emirates");
    	gCCStates.setConfirmedCases(21);
    	gCCStates.setDeaths(0);
    	gCCStates.setRecovered(5);
    	gCCStates.setLatitude("24.0000");	
    	gCCStates.setLogitude("54.0000");
    	gccStatesList.add(gCCStates);
    	
    	//second
    	gCCStates.setId(2);
    	gCCStates.setProvince("Bahrain");
    	gCCStates.setRegion("Bahrain");
    	gCCStates.setConfirmedCases(85);
    	gCCStates.setDeaths(0);
    	gCCStates.setRecovered(4);
    	gCCStates.setLatitude("26.0275");	
    	gCCStates.setLogitude("50.5500");
    	gccStatesList.add(gCCStates);
    	
    	//third
    	gCCStates = new GCCStates();
    	gCCStates.setId(3);
    	gCCStates.setProvince("Oman");
    	gCCStates.setRegion("Oman");
    	gCCStates.setConfirmedCases(16);
    	gCCStates.setDeaths(0);
    	gCCStates.setRecovered(2);
    	gCCStates.setLatitude("21.0000");	
    	gCCStates.setLogitude("57.0000");
    	gccStatesList.add(gCCStates);
    	
    	//forth
    	gCCStates = new GCCStates();
    	gCCStates.setId(4);
    	gCCStates.setProvince("Kuwait");
    	gCCStates.setRegion("Kuwait");
    	gCCStates.setConfirmedCases(64);
    	gCCStates.setDeaths(0);
    	gCCStates.setRecovered(1);
    	gCCStates.setLatitude("29.5000");		
    	gCCStates.setLogitude("47.7500");
    	gccStatesList.add(gCCStates);
    	
    	//fifth
    	gCCStates = new GCCStates();
    	gCCStates.setId(5);
    	gCCStates.setProvince("Qatar");
    	gCCStates.setRegion("Qatar");
    	gCCStates.setConfirmedCases(15);
    	gCCStates.setDeaths(0);
    	gCCStates.setRecovered(0);
    	gCCStates.setLatitude("25.3548");		
    	gCCStates.setLogitude("51.1839");
    	gccStatesList.add(gCCStates);
    
    	//sixth
		  gCCStates = new GCCStates(); 
		  gCCStates.setId(6);
		  gCCStates.setProvince("Saudi Arabia"); 
		  gCCStates.setRegion("Saudi Arabia");
		  gCCStates.setConfirmedCases(11); 
		  gCCStates.setDeaths(0);
		  gCCStates.setRecovered(0); 
		  gCCStates.setLatitude("24.0000");
		  gCCStates.setLogitude("45.0000"); 
		  gccStatesList.add(gCCStates);
	 
		  gccStatesRepository.saveAll(gccStatesList);
    	return gccStatesRepository.findAll();

	}
	
	public List<GCCStates> getGCCStates(){
		return gccStatesRepository.findAll();
	}
	
	public GCCStates getGCCStatesByLatLog(String latitude, String logitude) {
		return gccStatesRepository.getGCCStatesByLatLog(latitude,logitude);
	}
	
	public List<Panorama> getPanoramaData(){
		List<Panorama> panoramaData = new ArrayList<Panorama>();
    	Panorama pan = new Panorama();
    	List<Person> perList = new ArrayList<Person>();
    	Person per = new Person();
    	per.setPid(1);
    	per.setFName("AAA");
    	per.setPhone("555-2777888");
    	per.setEmail("aaa@abc.com");
    	
    	per.setZipCode("United Arab Emirates");
    	perList.add(per);
    	per = new Person();
    	per.setPid(2);
    	per.setFName("BBB");
    	 
    	per.setZipCode("United Arab Emirates");
    	per.setPhone("666-1777888");
    	per.setEmail("bbb@abc.com");
    	perList.add(per);
    	personRepository.saveAll(perList);  	 
    	
    	pan.setDisease("Dengue");
    	pan.setLatitude("24.0000");	
    	pan.setLongitude("54.0000");
    	pan.setZipCode("United Arab Emirates");
    	panoramaData.add(pan);

    	
    	pan = new Panorama();
    	
    	per = new Person();
    	perList = new ArrayList<Person>();
    	per.setPid(3);
    	per.setFName("CCC");
    	
    	per.setPhone("777-8888999");
    	per.setEmail("aaa@abc.com");
    	per.setZipCode("Bahrain");
    	perList.add(per);
    	personRepository.saveAll(perList);
    	pan.setDisease("Corono Virus");
    	pan.setLatitude("26.0275");	
    	pan.setLongitude("50.5500");
    	pan.setZipCode("Bahrain");   
    	
    	panoramaData.add(pan);	
    	
    	panoramaRepository.saveAll(panoramaData);
    	return panoramaRepository.findAll(); 
	}
	
	public Panorama getPanoramaByLatLog(String lat, String log) {
		return panoramaRepository.getPanoramaByLatLog(lat,log);
	}
	
	public List<Person> getPersonData(){
		
		Person per = new Person();
    	
    	List<Person> persons = new ArrayList<Person>();
    	
    	//1st
    	per.setPid(1);
    	per.setFName("AAA");
    	per.setZipCode("Bahrain");
    	per.setPhone("222-2777888");
    	per.setEmail("aaa@xyz.com");
    	persons.add(per);
    	
    	//2nd person
    	per = new Person();
   	   	per.setPid(2);
    	per.setFName("BBB");
    	per.setPhone("333-3777888");
    	per.setEmail("bbb@abc.com");
    	per.setZipCode("Qatar");
    	
    	persons.add(per);
    	personRepository.saveAll(persons);
    	return personRepository.findAll();
	}
	
	public List<Person> getContactDetails(Integer id){
		return personRepository.getContactDtails(id);
	}
	

}
