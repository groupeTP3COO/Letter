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
		return new PromissoryNote(receiver, sender, new Money(50));
	}

	@Test
	public void getCostTest() {
		assertEquals(1, this.createLetter().getCost());

	}
	
	/*@Test
	public void actionTest() {
		PromissoryNote promissory=this.createLetter();
		promissory.action();
		assertEquals(50,promissory.getSender().getBankaccount().getAmount());
		assertEquals(150,promissory.getReceiver().getBankaccount().getAmount());
		
	}*/

}