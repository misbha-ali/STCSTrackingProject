package com.ibm.stcs.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	@Query("select per from Person per where per.zipCode=(select pan.zipCode from Panorama pan where pan.id=?1)")
	List<Person> getContactDtails(Integer id);
	

}
