package city;

import static org.junit.Assert.*;

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
		application = new Application("Lille", 6, 10);

	}

	@Test
	public void applicationConstractorTest() {
		assertEquals(10, application.city.getNbInHabitants());
		assertEquals(6, application.getNbDay());
		assertEquals("Lille", application.city.getCityName());
		assertFalse(application.city.getInhabitants().isEmpty());
		assertEquals(10, application.city.getInhabitants().size());

	}

	@Test(expected = IllegalArgumentException.class)
	public void applicationExceptionTest() {
		application = new Application("Lille", 6, 1);
		fail("the number of inhabitant have to be at least 2");
	}

	@Test
	public void completePostboxTest() {
		application.CompletePostbox();
		assertFalse(application.city.postBox.isEmpty());
	}

}
