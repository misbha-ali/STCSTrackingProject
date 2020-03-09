package com.ibm.stcs.domain;

import javax.persistence.*;
	@Entity
	@Table(name = "GCCStates")
	public class GCCStates {

	    @Id
	    private Integer id;
	    private String province;
	    private String region;
	    private Integer confirmedCases;
	    private Integer deaths;
	    private Integer recovered;
	    private String latitude;
	    private String logitude;

	    public GCCStates() {
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }
	    public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getRegion() {
			return region;
		}

		public void setRegion(String region) {
			this.region = region;
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



