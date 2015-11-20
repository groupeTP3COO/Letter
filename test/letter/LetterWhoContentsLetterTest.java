/**
 * 
 */
package letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author legrand
 * 
 *         test of the common point between letters class letter who contents
 *         letters
 *
 */
public abstract class LetterWhoContentsLetterTest extends LetterTest<MockLetter> {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link letter.LetterwhoContentsLetter#action()}.
	 */
	@Test
	public void testAction() {
		letter.action();
		assertTrue(((MockLetter) letter.getContent()).getActionWasDo());
	}

}
