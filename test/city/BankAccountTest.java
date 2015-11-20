/**
 * 
 */
package city;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author legrand
 * 
 *         this class tests bank account
 */
public class BankAccountTest {

	protected BankAccount bankAccount;

	@Before
	public void setup() {
		this.bankAccount = new BankAccount(10);
	}

	@Test
	public void testGetAmount() {
		assertEquals(10, this.bankAccount.getAmount());
	}

	/**
	 * Test method for {@link city.BankAccount#credit(int)}.
	 */
	@Test
	public void testCredit() {
		this.bankAccount.credit(2);
		assertEquals(12, this.bankAccount.getAmount());
	}

	/**
	 * Test method for {@link city.BankAccount#debit(int)}.
	 */
	@Test
	public void testDebit() {
		this.bankAccount.debit(2);
		assertEquals(8, this.bankAccount.getAmount());
	}

}
