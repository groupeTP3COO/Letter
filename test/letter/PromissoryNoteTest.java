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
		return new PromissoryNote(receiver, sender, new Money(150));
	}

	@Test
	public void getCostTest() {
		assertEquals(SimpleLetter.cost + 1, ((PromissoryNote) letter).getCost());

	}
	
	@Test
	public void actionTest() {
		((PromissoryNote) letter).action();
		assertEquals(50,((PromissoryNote) letter).getSender().getAmountOfBankaccount());
		assertEquals(349,((PromissoryNote) letter).getReceiver().getAmountOfBankaccount());
		
	}

}