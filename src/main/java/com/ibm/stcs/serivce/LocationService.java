package com.ibm.stcs.serivce;

import java.util.List;

import com.ibm.stcs.domain.GCCStates;
import com.ibm.stcs.domain.Panorama;
import com.ibm.stcs.domain.Person;


public interface LocationService {
	List<GCCStates> createGCCStates();
	List<GCCStates> getGCCStates();
	GCCStates getGCCStatesByLatLog(String lat, String log);
	List<Panorama> getPanoramaData();
	Panorama getPanoramaByLatLog(String lat, String log);
	List<Person> getPersonData();
	List<Person> getContactDetails(Integer id);

}
