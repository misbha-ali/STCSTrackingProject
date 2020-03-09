package com.ibm.stcs.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PanoramaRepository extends JpaRepository<Panorama, Integer>{
	@Query("select panorama from Panorama panorama where panorama.latitude=?1 and panorama.longitude=?2")
	Panorama getPanoramaByLatLog(String latitude,String longitude);
}
