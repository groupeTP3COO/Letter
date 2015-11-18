/**
 * 
 */
package letter;

import static org.junit.Assert.*;

import org.junit.Test;

import city.Inhabitant;
import content.Text;


/**
 * @author negmi
 *
 */
public class AcknowledgementOfReceiptTest extends LetterTest<Text>  {

	
	@Override
	protected Letter<?> createLetter(Inhabitant sender, Inhabitant receiver) {
		return new acknowledgementOfReceipt (new RegisteredLetter(new SimpleLetter(sender,receiver,new Text("test"))));
	}
	
	@Test 
	public void getCostTest() {
		assertEquals(0, this.createLetter(sender, receiver).getCost());
	}

	
}