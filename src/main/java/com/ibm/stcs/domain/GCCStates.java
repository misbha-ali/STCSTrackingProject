package com.ibm.stcs.domain;

import javax.persistence.*;
	@Entity
	@Table(name = "GCCStates")
	public class GCCStates {

	    @Id	    
	    private Integer id;
	    public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		private String countryName;
	    private String latitude;
	    private String logitude;

	    public GCCStates() {
	    }

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
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



