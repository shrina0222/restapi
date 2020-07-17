package com.flexonjune.restAPIs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class JAVACustomerDAO {
	
private ArrayList<JAVACustomer> customer = new 	ArrayList<>();
	
	public JAVACustomerDAO() {
		customer.add(new JAVACustomer(1,"Shrina","Patel",123456789));
	}
	
	public ArrayList<JAVACustomer> getAllCustomers(){
		return customer;
	}
	
	public ArrayList<JAVACustomer> getAllCustomers(String customerName){
		
		return customer;
	}
	
	public JAVACustomer addNewCustomer(JAVACustomer newCustomer) {
		
		customer.add(newCustomer);
		return newCustomer;
		
	}
	public JAVACustomer deleteCustomer(JAVACustomer newCustomer) {
		
		customer.remove(newCustomer);
		return newCustomer;
		
	}
	


}







	