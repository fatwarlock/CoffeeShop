import java.time.LocalDate;
import java.time.LocalDateTime;

import Entities.concretes.Customer;
import core.adapter.MernisServiceAdapter;
import dataAccsess.abstarcts.BaseCustomerManager;
import dataAccsess.concretes.NeroCustomerManager;
import dataAccsess.concretes.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = (BaseCustomerManager) new StarbucksCustomerManager(new MernisServiceAdapter() );
		customerManager.save(new Customer (1,"Fatih ", "Yýldýrým", LocalDate.of(2002, 01, 11), "21313123123"));

	}

}
