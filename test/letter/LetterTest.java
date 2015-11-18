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

	protected abstract Letter<?> createLetter(Inhabitant sender, Inhabitant receiver);

	@Before
	public void init() {
		City city = new City("TestCity");
		BankAccount bankaccount = new BankAccount(100);
		sender = new MockInhabitant("toto", city, bankaccount);
		receiver = new MockInhabitant("titi", city, bankaccount);
		letter = createLetter(sender, receiver);
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