package com.flexonjune.restAPIs;
import java.util.ArrayList;


//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JAVACustomerController {
	
		@Autowired
		private JAVACustomerDAO customerDAO = new JAVACustomerDAO() ;
		
		
		
		
		//Get all Customers from the Arraylist
		@GetMapping(path="/getAllexistingCustomers")
		public ArrayList<JAVACustomer> getAllexistingCustomers(){
			return customerDAO.getAllCustomers();
		}
		
		
		
		//Adding a new customer into the classroom
		@PostMapping(path="/addNewCustomer")
		public ResponseEntity addNewCustomer( @RequestBody JAVACustomer newCustomer){
			customerDAO.addNewCustomer(newCustomer);
			
			return new ResponseEntity<>("Created new student",HttpStatus.CREATED);
		
		}
			
}
