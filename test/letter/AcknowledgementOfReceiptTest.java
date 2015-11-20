/**
 * 
 */
package letter;

import static org.junit.Assert.*;

import org.junit.Test;

import content.Text;

/**
 * @author negmi
 * 
 *         test of the class AcknowledgementOfReceipt
 *
 */
public class AcknowledgementOfReceiptTest extends LetterTest<Text> {

	@Override
	protected Letter<Text> createLetter() {
		return new acknowledgementOfReceipt(new RegisteredLetter(new SimpleLetter(receiver, sender, new Text("test"))));
	}

	@Test
	public void getCostTest() {
		assertEquals(0, ((acknowledgementOfReceipt) letter).getCost());
	}

}