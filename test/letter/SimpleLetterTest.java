package letter;

import static org.junit.Assert.*;

import org.junit.Test;

import content.*;

public class SimpleLetterTest extends LetterTest<Text> {
	protected Text contentLetter = new Text("blabla");

	public Letter<Text> createLetter() {
		return new SimpleLetter(sender, receiver, contentLetter);
	}

	
	@Test
	public void getCostTest() {
		assertEquals(SimpleLetter.cost, ((SimpleLetter) letter).getCost());
	}

}