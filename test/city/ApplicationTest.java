package city;

import static org.junit.Assert.*;


import letter.Letter;
import letter.SimpleLetter;

import org.junit.Before;
import org.junit.Test;

import content.Text;

/**
 * tests of Application class
 * 
 * @author addou
 * 
 */
public class ApplicationTest {

	protected Application application;
	protected Text contentLetter = new Text("blabla");
	@Before
	public void setup() {		
		application = new Application("Lille", 6 , 10);		
		
	}
	

	@Test
	public void applicationConstractorTest() {
		assertEquals(10, application.city.getNbInHabitants());
		assertEquals(6, application.getNbDay());
		assertEquals("Lille", application.city.getCityName());
		assertFalse(application.city.getInhabitants().isEmpty());
		assertEquals(10, application.city.getInhabitants().size());

	}
	@Test  (expected = IllegalArgumentException.class)
	public void applicationExceptionTest() {
		application = new Application("Lille", 6 , 1);
		fail("the number of inhabitant have to be at least 2");
	}
	
	@Test
	public void sendLetterTest() {
		Letter<?> simpleLetter = createLetter();
		application.city.sendLetter(simpleLetter);
		assertTrue(application.city.postBox.contains(simpleLetter));
	}
	
	public Letter<?> createLetter() {
		return new SimpleLetter(new Inhabitant("Inhabitant1", application.city, new BankAccount(200)), 
				new Inhabitant("Inhabitant1", application.city ,	new BankAccount(200)), contentLetter);
	}
	
	@Test
	public void distributeLetterTest() {
		Letter<?> simpleLetter = createLetter();
		application.city.sendLetter(simpleLetter);
		assertTrue(application.city.postBox.contains(simpleLetter));
		application.city.distributeLetters();
		assertTrue(application.city.postBox.isEmpty());
	}

	@Test
	public void completePostboxTest() {
		application.CompletePostbox();
		assertFalse(application.city.postBox.isEmpty());
	}
	

}
