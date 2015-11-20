package city;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import letter.MockLetter;
import org.junit.Before;
import org.junit.Test;

import content.Text;

/**
 * tests of City class
 * 
 * @author addou
 * 
 */
public class CityTest {
	protected City city;
	protected Text contentLetter = new Text("blabla");

	@Before
	public void setup() {

		city = new City("Lille");
	}

	@Test
	public void cityConstractorTest() {
		assertEquals("Lille", city.getCityName());
		assertEquals(0, city.getNbInHabitants());
		assertTrue(city.getInhabitants().isEmpty());

	}

	@Test
	public void addInHabitantTest() {
		MockInhabitant inhabitant = new MockInhabitant("Inhabitant1", city, new BankAccount(200));
		city.addInHabitant(inhabitant);
		assertEquals(1, city.getInhabitants().size());
		assertTrue(city.getInhabitants().contains(inhabitant));
	}

	@Test
	public void sendLetterTest() {
		MockLetter letter = createLetter();
		city.sendLetter(letter);
		assertTrue(city.postBox.contains(letter));
	}

	public MockLetter createLetter() {
		return new MockLetter(new MockInhabitant("Inhabitant1", city, new BankAccount(200)),
				new MockInhabitant("Inhabitant1", city, new BankAccount(200)), contentLetter);
	}

	@Test
	public void distributeLetterTest() {
		MockLetter letter = createLetter();
		city.sendLetter(letter);
		assertTrue(city.postBox.contains(letter));
		city.distributeLetters();
		assertTrue(city.postBox.isEmpty());
		assertTrue(((MockInhabitant) letter.getReceiver()).getLetterIsReceived());
	}

}
