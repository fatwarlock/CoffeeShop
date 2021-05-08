package core.adapter;

import java.rmi.RemoteException;

import Entities.concretes.Customer;
import dataAccsess.abstarcts.CustomerCheckService;
import mernis.KPSPublicSoap;
import mernis.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean check = false;
		
		try {
			 check = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
												customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return check;
	}
	
}
