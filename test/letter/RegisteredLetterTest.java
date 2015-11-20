package letter;

import content.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 
 * tests of registeredLetter
 *
 */

public class RegisteredLetterTest extends LetterWhoContentsLetterTest {

	protected RegisteredLetter createLetter() {
		return new RegisteredLetter(new MockLetter(sender, receiver, new Text("test.")));
	}

	/*
	 * tests if a Acknowledgment is send to the sender of the registered letter
	 */
	@Test
	public void receiverSendsAcknowledgment() {
		assertEquals(0, receiver.getNumberOfLetterSent());
		letter.action();
		assertEquals(1, receiver.getNumberOfLetterSent());
	}

	@Test
	public void getCostTest() {
		assertEquals(SimpleLetter.cost + RegisteredLetter.additionalCost, letter.getCost());
	}
}
