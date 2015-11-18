/**
 * 
 */
package letter;

import static org.junit.Assert.*;

import content.*;
import org.junit.Test;

/**
 * @author negmi
 *
 */
public class PromissoryNoteTest extends LetterTest<Money> {

	protected PromissoryNote createLetter() {
		return new PromissoryNote(receiver, sender, new Money(100));
	}

	@Test
	public void getCostTest() {

		assertEquals(2, 1 + this.createLetter().content.getAmount() / 100);

	}

}