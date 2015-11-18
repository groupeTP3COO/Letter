package letter;

import content.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RegisteredLetterTest extends LetterTest<Text> {

	protected RegisteredLetter createLetter() {
		return new RegisteredLetter(new MockLetter(sender, receiver, new Text("test.")));
	}

	@Test
	public void receiverSendsAcknowledgment() {
		assertEquals(0, receiver.numberOfLetterSent);
		this.createLetter().getContent().action();
		assertEquals(1, receiver.numberOfLetterSent);
	}

	@Test
	public void getCostTest() {
		RegisteredLetter rletter = this.createLetter();
		assertEquals(15, rletter.getCost() );
	}
}
