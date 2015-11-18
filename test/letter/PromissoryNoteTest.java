/**
 * 
 */
package letter;
import static org.junit.Assert.*;
import city.Inhabitant;
import content.*;
import org.junit.Test;

/**
 * @author negmi
 *
 */
public class PromissoryNoteTest extends LetterTest<Money> {

	protected Letter<?> createLetter(Inhabitant sender, Inhabitant receiver) {
		return new PromissoryNote(sender,receiver, new Money(100));
	}


	@Test
	public void getCostTest() {
		assertEquals(2 , 1+ (this.createLetter(sender, receiver).getCost())/100);
	}
	
}