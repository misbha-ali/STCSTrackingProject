package com.ibm.stcs.serivce;

import java.util.List;

import com.ibm.stcs.domain.Covid19;
import com.ibm.stcs.domain.GCCStates;
import com.ibm.stcs.domain.Panorama;
import com.ibm.stcs.domain.Person;


public interface LocationService {
	List<Covid19> createCovid19Data();
	List<Covid19> getCovid19Data();
	List<GCCStates> getGCCStatesFromCovid(Integer covidCountry);
	List<GCCStates> createGCCStates();
	List<GCCStates> getGCCStates();
	GCCStates getGCCStatesByLatLog(String lat, String log);
	List<Panorama> getPanoramaData();
	Panorama getPanoramaByLatLog(String lat, String log);
	List<Person> getPersonData();
	List<Person> getContactDetails(Integer id);

}
