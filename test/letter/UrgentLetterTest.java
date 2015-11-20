/**
 * 
 */
package letter;

import static org.junit.Assert.*;

import org.junit.*;

import content.*;

/**
 * @author negmi
 * 
 *         tests the urgent letter
 *
 */
public class UrgentLetterTest extends LetterWhoContentsLetterTest {

	@Override
	protected UrgentLetter createLetter() {
		return new UrgentLetter(new MockLetter(sender, receiver, new Text("test")));
	}

	@Test
	public void getCostTest() {
		assertEquals(2 * 1, ((UrgentLetter) letter).getCost());
	}

}