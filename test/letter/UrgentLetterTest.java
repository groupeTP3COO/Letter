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
 */
public class UrgentLetterTest extends LetterTest<Text> {

	@Override
	protected UrgentLetter createLetter() {
		return new UrgentLetter(new SimpleLetter(sender, receiver, new Text("test")));
	}

	@Test
	public void getCostTest() {
		assertEquals(2, this.createLetter().getCost() );
	}

}