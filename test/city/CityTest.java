package city;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import letter.Letter;
import letter.SimpleLetter;

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
		Inhabitant inhabitant = new Inhabitant("Inhabitant1", city,
				new BankAccount(200));
		city.addInHabitant(inhabitant);
		assertEquals(1, city.getInhabitants().size());
		assertTrue(city.getInhabitants().contains(inhabitant));
	}

	@Test
	public void sendLetterTest() {
		Letter<?> simpleLetter = createLetter();
		city.sendLetter(simpleLetter);
		assertTrue(city.postBox.contains(simpleLetter));
	}

	public Letter<?> createLetter() {
		return new SimpleLetter(new Inhabitant("Inhabitant1", city,
				new BankAccount(200)), new Inhabitant("Inhabitant1", city,
				new BankAccount(200)), contentLetter);
	}

	@Test
	public void distributeLetterTest() {
		Letter<?> simpleLetter = createLetter();
		city.sendLetter(simpleLetter);
		assertTrue(city.postBox.contains(simpleLetter));
		city.distributeLetters();
		assertTrue(city.postBox.isEmpty());
	}

}
