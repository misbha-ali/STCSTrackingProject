package com.ibm.stcs.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Covid19")
public class Covid19 {
	
	

	    @Id
	    @GeneratedValue
	    private Integer id;
	    private String state;
	    private String country;
	    private Date lastUpdated;
	    private Integer confirmedCases;
	    private Integer deaths;
	    private Integer recovered;
	    private String latitude;
	    private String logitude;
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Date getLastUpdated() {
			return lastUpdated;
		}
		public void setLastUpdated(Date lastUpdated) {
			this.lastUpdated = lastUpdated;
		}
		public Integer getConfirmedCases() {
			return confirmedCases;
		}
		public void setConfirmedCases(Integer confirmedCases) {
			this.confirmedCases = confirmedCases;
		}
		public Integer getDeaths() {
			return deaths;
		}
		public void setDeaths(Integer deaths) {
			this.deaths = deaths;
		}
		public Integer getRecovered() {
			return recovered;
		}
		public void setRecovered(Integer recovered) {
			this.recovered = recovered;
		}
		public String getLatitude() {
			return latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLogitude() {
			return logitude;
		}
		public void setLogitude(String logitude) {
			this.logitude = logitude;
		}
	    
	    

}
