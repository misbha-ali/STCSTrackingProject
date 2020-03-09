package com.ibm.stcs.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GccStatesRepository extends JpaRepository<GCCStates, Integer> {
	
	@Query("select gccstates from GCCStates gccstates where gccstates.latitude=?1 and gccstates.logitude=?2")
	GCCStates getGCCStatesByLatLog(String latitude,String logitude);

}
