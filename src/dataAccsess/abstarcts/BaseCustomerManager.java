package dataAccsess.abstarcts;

import Entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void save(Customer customer) {
		System.out.println("saved to database : " + customer.getFirstName() );
		
	}

}
