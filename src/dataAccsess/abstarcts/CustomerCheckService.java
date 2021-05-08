package dataAccsess.abstarcts;

import Entities.concretes.Customer;

public interface CustomerCheckService {
	 boolean CheckIfRealPerson(Customer customer);
}
