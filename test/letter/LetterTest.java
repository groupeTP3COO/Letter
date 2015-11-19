package letter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import city.*;
import content.Content;

public abstract class LetterTest<T extends Content> implements Content {

	protected MockInhabitant sender;
	protected MockInhabitant receiver;
	protected Letter<?> letter;

	protected abstract Letter<?> createLetter();

	@Before
	public void init() {
		City city = new City("TestCity");
		BankAccount bankaccount1 = new BankAccount(200);
		BankAccount bankaccount2 = new BankAccount(200);
		sender = new MockInhabitant("toto", city, bankaccount1);
		receiver = new MockInhabitant("titi", city, bankaccount2);
		letter = createLetter();
	}

	@Test
	public void getSenderTest() {
		assertEquals(sender, letter.getSender());
	}

	@Test
	public void getReceiverTest() {
		assertEquals(receiver, letter.getReceiver());
	}

}