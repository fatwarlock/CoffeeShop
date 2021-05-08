package dataAccsess.concretes;

import Entities.concretes.Customer;
import dataAccsess.abstarcts.CustomerCheckService;


public class CustomerCheckManager implements CustomerCheckService {

	
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

	

	
}
