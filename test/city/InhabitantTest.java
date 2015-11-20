package city;

import static org.junit.Assert.*;

/**
 *@author legrand
 *
 * this class test Inhabitant
 */

import org.junit.Before;
import org.junit.Test;

import content.Text;
import letter.MockLetter;

public class InhabitantTest {
	
	protected Inhabitant inhabitant;
	protected MockLetter letter;
	
	@Before
	public void setUp() throws Exception {
		this.inhabitant = new Inhabitant("inhabitant", new CityForTest("testCity") , new BankAccountForTest(0));
		this.letter = new MockLetter(this.inhabitant, new Inhabitant("inhabitant2", new CityForTest("testCity") , new BankAccountForTest(0)), new Text("d"));
	}

	@Test
	public void testGetAmountOfBankaccount() {
		assertEquals(1, inhabitant.getAmountOfBankaccount());
	}

	@Test
	public void testCredit() {
		inhabitant.credit(5);
		assertEquals(5, ((BankAccountForTest) inhabitant.bankaccount).creditDone);
	}

	@Test
	public void testDebit() {
		inhabitant.debit(5);
		assertEquals(5, ((BankAccountForTest) inhabitant.bankaccount).debitDone);
	}

	@Test
	public void testSendLetter() {
		inhabitant.sendLetter(letter);
		assertTrue(inhabitant.city.postBox.contains(letter));
	}

	@Test
	public void testReceiveLetter() {
		inhabitant.receiveLetter(letter);
		assertTrue(letter.getActionWasDo());
	}

}
