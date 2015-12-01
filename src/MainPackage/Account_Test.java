package MainPackage;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Account_Test {
	
	Account myAccount;
	
	@Before
	public void setUp() throws Exception {
		myAccount = new Account(1112, 20000);
	}

	@After
	public void tearDown() throws Exception {
		myAccount = null;
	}

	@Test 
	public void test() throws InsufficientFundsException {
		myAccount.setAnnualInterestRate(4.5);		
		myAccount.withdraw(2500);
		assertEquals("Withdraw Test", (long)myAccount.getBalance(), (long)17500.00);
		myAccount.deposit(3000);
		assertEquals("Deposit Test", (long)myAccount.getBalance(), (long)20500.00);
		Date date = myAccount.getDateCreated();
		System.out.printf("Monthly Interest Rate = %.2f%%, Current Balance = $%.2f, Date = %s", myAccount.getMonthlyInterestRate(), myAccount.getBalance(), date);
	}	
	
	@Test (expected = InsufficientFundsException.class)
	public final void withdraw_more() throws InsufficientFundsException {
		myAccount.withdraw(300000);
	}
}