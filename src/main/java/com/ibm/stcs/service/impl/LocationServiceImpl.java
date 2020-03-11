package com.ibm.stcs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.stcs.domain.Covid19;
import com.ibm.stcs.domain.Covid19Repository;
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
	
	@Autowired
	private Covid19Repository covid19Repository;
	
	
	public List<Covid19> createCovid19Data() {
		
    	Covid19 covid19 = new Covid19();
    	List<Covid19> covid19Details = new ArrayList<Covid19>();
    	
    	
    	//first
    	//covid19.setId(1);
    	covid19.setState("United Arab Emirates");
    	covid19.setCountry("United Arab Emirates");
    	covid19.setConfirmedCases(21);
    	covid19.setDeaths(0);
    	covid19.setRecovered(5);
    	covid19.setLatitude("24.0000");	
    	covid19.setLogitude("54.0000");
    	covid19Details.add(covid19);
    	
    	
    	
    	
    	
    	//second
    	
    	covid19 = new Covid19();
    	//covid19.setId(2);
    	covid19.setState("Bahrain");
    	covid19.setCountry("Bahrain");
    	covid19.setConfirmedCases(85);
    	covid19.setDeaths(0);
    	covid19.setRecovered(4);
    	covid19.setLatitude("26.0275");	
    	covid19.setLogitude("50.5500");
    	covid19Details.add(covid19);    	
       	
    	
    	
    	//third
    	covid19 = new Covid19();
    	//covid19.setId(3);
    	covid19.setState("Oman");
    	covid19.setCountry("Oman");
    	covid19.setConfirmedCases(16);
    	covid19.setDeaths(0);
    	covid19.setRecovered(2);
    	covid19.setLatitude("21.0000");	
    	covid19.setLogitude("57.0000");
    	covid19Details.add(covid19);
    	
    	//forth
    	covid19 = new Covid19();
    	//covid19.setId(4);
    	covid19.setState("Kuwait");
    	covid19.setCountry("Kuwait");
    	covid19.setConfirmedCases(64);
    	covid19.setDeaths(0);
    	covid19.setRecovered(1);
    	covid19.setLatitude("29.5000");		
    	covid19.setLogitude("47.7500");
    	covid19Details.add(covid19);
    	
    	//fifth
    	covid19 = new Covid19();
    	//covid19.setId(5);
    	covid19.setState("Qatar");
    	covid19.setCountry("Qatar");
    	covid19.setConfirmedCases(15);
    	covid19.setDeaths(0);
    	covid19.setRecovered(0);
    	covid19.setLatitude("25.3548");		
    	covid19.setLogitude("51.1839");
    	covid19Details.add(covid19);
    
    	//sixth
    	covid19 = new Covid19(); 
    	//covid19.setId(6);
    	covid19.setCountry("Saudi Arabia"); 
    	covid19.setState("Saudi Arabia");
    	covid19.setConfirmedCases(11); 
    	covid19.setDeaths(0);
    	covid19.setRecovered(0); 
    	covid19.setLatitude("24.0000");
    	covid19.setLogitude("45.0000"); 
		  covid19Details.add(covid19);
	 
		  covid19Repository.saveAll(covid19Details);
    	return covid19Repository.findAll();

	}
	
	public List<Covid19> getCovid19Data(){
		return covid19Repository.findAll();
	}
	
	public List<GCCStates> createGCCStates() {
		List<GCCStates> gccStatesList = new ArrayList<GCCStates>();
    	GCCStates gCCStates = new GCCStates();
    	
    	//first
    	gCCStates.setId(1);
    	gCCStates.setCountryName("United Arab Emirates");    	
    	gCCStates.setLatitude("24.0000");	
    	gCCStates.setLogitude("54.0000");
    	gccStatesList.add(gCCStates);
    	
    	//second
    	
       	gCCStates = new GCCStates();
       	gCCStates.setId(2);
    	gCCStates.setCountryName("Bahrain");    
    	gCCStates.setLatitude("26.0275");	
    	gCCStates.setLogitude("50.5500");
    	gccStatesList.add(gCCStates);
    	
    	//third
    	
    	gCCStates = new GCCStates();
    	gCCStates.setId(3);
       	gCCStates.setCountryName("Oman");   	
    	gCCStates.setLatitude("21.0000");	
    	gCCStates.setLogitude("57.0000");
    	gccStatesList.add(gCCStates);
    	
    	//forth
    	
    	gCCStates = new GCCStates();
    	gCCStates.setId(4);
       	gCCStates.setCountryName("Kuwait");    	
    	gCCStates.setLatitude("29.5000");		
    	gCCStates.setLogitude("47.7500");
    	gccStatesList.add(gCCStates);
    	
    	//fifth
    	gCCStates = new GCCStates();
    	gCCStates.setId(5);
       	gCCStates.setCountryName("Qatar");    	
    	gCCStates.setLatitude("25.3548");		
    	gCCStates.setLogitude("51.1839");
    	gccStatesList.add(gCCStates);
    
    	//sixth
		  gCCStates = new GCCStates(); 
		  gCCStates.setId(6);
		  gCCStates.setCountryName("Saudi Arabia"); 
		  gCCStates.setLatitude("24.0000");
		  gCCStates.setLogitude("45.0000"); 
		  gccStatesList.add(gCCStates);
	 
		  gccStatesRepository.saveAll(gccStatesList);
    	return gccStatesRepository.findAll();

	}
	
	
	public List<GCCStates> getGCCStates(){
		return gccStatesRepository.findAll();
	}
	
	public List<GCCStates> getGCCStatesFromCovid(Integer covidId){
		return gccStatesRepository.getGCCStatesFromCovid(covidId);
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
