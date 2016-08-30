package com.bootcamp.employeesurvey.services;

import com.bootcamp.employeesurvey.DAO.EmployeeInfoDAO;
import com.bootcamp.employeesurvey.utilities.Employee;

/**
 * @author Jagan Reddy
 * 
 */
public class EmployeeInfoService {

	/**
	 * @param employee
	 * @return
	 * This method will return a message whether data stored in database or not?
	 */
	public String getMessage(Employee employee) {
		
		String messege = "";		
		EmployeeInfoDAO sd = new EmployeeInfoDAO();
		
		try {
			boolean status = sd.storeInDataBase(employee);

			if (status) {
				
				messege = "Data Stored in Database";
			} else {
				
				messege = "Data not Stored in Data base";
			}
		} catch (Exception e) {
			
			messege = "Data not Stored in Data base";
		}
		return messege;
	}

}
