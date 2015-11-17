package city;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import letter.Letter;
import letter.PromissoryNote;
import letter.RegisteredLetter;
import letter.SimpleLetter;
import letter.acknowledgementOfReceipt;

import org.junit.Before;
import org.junit.Test;

import content.Text;

public class cityTest {
	City city;
	Application appli;

	@Before
	public void setup() {
		city = new City("C1");
		appli = new Application(city, 6 , 10);
	}
	

	@Test
	public void appliConstractorTest() {
		assertEquals(10, appli.getNbInHabitants());
		assertEquals(6, appli.getNbDay());
		assertEquals("C1", city.getCityName());
		assertEquals(10, appli.getInHAbiatantsList().size());
	}

	@Test
	public void cityConstractorTest() {		
		assertEquals("C1", city.getCityName());
		assertTrue(city.getInHabitantsList().size()==10);
	}
	@Test
	public void getInHAbiatantsListTest(){	
		assertFalse(appli.getInHAbiatantsList().isEmpty());
		
	}
	@Test
	public void getRandomInhabitantTest() {
		
		Inhabitant inhabitant = appli.getRandomInhabitant();
		assertFalse(appli.getInHAbiatantsList().isEmpty());
	}
	@Test
	public void getRandomLetterTest()  {		
		Letter<?> letter = appli.getRandomLetter() ;
		// **********
	}
	@Test
	public void  sendLetterTest() {		
		SimpleLetter letter = new SimpleLetter( appli.getRandomInhabitant(), appli.getRandomInhabitant(), new Text("simple1"));
		city.sendLetter(letter);
		assertTrue(city.postbox.contains(letter));
		
	}
	
	
}
