package examples.nbank;
import examples.nbank.Account;
import examples.nbank.CreditCard;
import examples.nbank.Customer;

public class NbankFactory {
	/**
	 * @jtest.factory
	 */
	public static Customer createCustomer() {
		String name = "john"; // UTA: default value
		String ssn = "123-45-6789"; // UTA: default value
		return new Customer(name, ssn);
	}
	
	/**
	 * @jtest.factory
	 */
	public static Account createAccount(Customer customer) {
		int initial_balance = 1000;
		return new Account(customer, initial_balance);
	}
	/**
	 * @jtest.factory
	 */
	public static CreditCard createCreditCard() {
		int balance = 1000; // UTA: default value
		String id = "123-45-6789"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "john"; // UTA: default value
		String zipcode = "91016"; // UTA: default value
		String creditCardNumber = "4111-1111-1111-1111"; // UTA: default value
		return new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);
	}

}
