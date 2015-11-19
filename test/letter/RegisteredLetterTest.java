package letter;

import content.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class RegisteredLetterTest extends LetterWhoContentsLetterTest {

	protected RegisteredLetter createLetter() {
		return new RegisteredLetter(new MockLetter(sender, receiver, new Text("test.")));
	}

	@Test
	public void receiverSendsAcknowledgment() {
		assertEquals(0, receiver.numberOfLetterSent);
		letter.action();
		assertEquals(1, receiver.numberOfLetterSent);
	}
  
	
	@Test
	public void getCostTest() {
		assertEquals(SimpleLetter.cost+RegisteredLetter.additionalCost, letter.getCost() );
	}
}
