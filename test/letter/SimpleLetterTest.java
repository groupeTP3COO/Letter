package letter;

import static org.junit.Assert.*;

import org.junit.Test;

import content.*;

public class SimpleLetterTest extends LetterTest<Text> {
	protected Text contentLetter = new Text("blabla");

	public Letter<?> createLetter() {
		return new SimpleLetter(sender, receiver, contentLetter);
	}

	@Test
	public void testContentInSimpleLetter() {
		Letter<?> simpleLetter = createLetter();
		int test = simpleLetter.getContent().toString().compareTo("blabla");
		assertEquals(test, 0);
	}

	@Test
	public void getCostTest() {
		assertEquals(1, letter.getCost());
	}

}