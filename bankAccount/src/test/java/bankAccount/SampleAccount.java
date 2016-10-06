package bankAccount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleAccount {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void SampleAccounttest() {
		Account trump = new Account(1);
		trump.setBalance(20000);
		trump.setInterest(.045);
		try {
			trump.withdraw(2500);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();	
		}
		trump.deposit(3000);
		assertNotEquals(trump.getId(), 100);
		assertEquals(trump.getId(), 1);
		assertEquals(trump.getBalance(),20500,.01);
		assertNotEquals(trump.getBalance(), 100);
	}
	@Test (expected = InsufficientFundsException.class)
	public void InsufficientFundsTest() throws InsufficientFundsException{
		Account trump = new Account(1);
		trump.setBalance(100);
		trump.withdraw(1000);
	}
}	

