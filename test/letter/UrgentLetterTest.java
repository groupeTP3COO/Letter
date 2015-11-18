/**
 * 
 */
package letter;

import static org.junit.Assert.*;

import org.junit.*;

import city.Inhabitant;

import content.*;

/**
 * @author negmi
 *
 */
public class UrgentLetterTest extends LetterTest<Text> {
	

	
	@Override
	protected Letter<?> createLetter(Inhabitant sender, Inhabitant receiver) {
		return new UrgentLetter(sender,receiver,new SimpleLetter(sender,receiver,"test"));
	}


	@Test
	public void getCostTest() {
		assertEquals(2,this.createLetter(sender, receiver).getCost()* 2);
	}


	 

}