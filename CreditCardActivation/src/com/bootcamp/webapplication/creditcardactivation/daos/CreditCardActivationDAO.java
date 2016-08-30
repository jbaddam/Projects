package com.bootcamp.webapplication.creditcardactivation.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bootcamp.webapplication.creditcardactivation.entities.CreditCard;
import com.bootcamp.webapplication.creditcardactivation.entities.Customer;

public class CreditCardActivationDAO {
	Customer customer1;
	CreditCard card;
	
	public void setCustomer1(Customer customer1) {
		this.customer1 = customer1;
	}

	public void setCard(CreditCard card) {
		this.card = card;
	}
	ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml") ;
	
	public  Customer getCreditCardInformation(Customer customer){
		
	
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "admin");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from customer c join creditcardinfo cd ON "
					+ "c.creditcard_number=cd.creditcard_number where c.CREDITCARD_NUMBER = "+customer.getCard().getCreditCardNumber());
			
			while(rs.next()){
				
				card.setCreditCardNumber(rs.getString(5));
				card.setCvv(rs.getString(6));
				card.setCreditLimit(rs.getString(7));
				
				customer1.setCard(card);
				customer1.setFname(rs.getString(1));
				customer1.setLname(rs.getString(2));
				customer1.setSsn(rs.getString(3));
				
			}
			
			st.close();
			con.close();
		
		} catch (Exception e) {
			
			System.out.println("JDBC PROBLEM");
			e.printStackTrace();
		}
		
		return customer1;
	}

	
	

}
