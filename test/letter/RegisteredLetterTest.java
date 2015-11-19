package letter;

import content.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class RegisteredLetterTest extends LetterTest<Text> {

	protected RegisteredLetter createLetter() {
		return new RegisteredLetter(new SimpleLetter(sender, receiver, new Text("test.")));
	}

	@Test
	public void receiverSendsAcknowledgment() {
		assertEquals(0, receiver.numberOfLetterSent);
		((RegisteredLetter) letter).action();
		assertEquals(1, receiver.numberOfLetterSent);
	}
  
	@Test
	public void actionTest() {
		((RegisteredLetter) letter).action();
		assertEquals(100,((RegisteredLetter) letter).getReceiver().getAmountOfBankaccount());
	
	}
	@Test
	public void getCostTest() {
		assertEquals(16, ((RegisteredLetter) letter).getCost() );
	}
}
