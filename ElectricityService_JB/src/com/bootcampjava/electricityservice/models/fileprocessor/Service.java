package com.bootcampjava.electricityservice.models.fileprocessor;


import java.util.Date;

/**
 * @author Jagan Reddy
 * Service entity class
 */
public class Service {

	private String serviceID;
	private Date startDate;
	private Date endDate;

	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
