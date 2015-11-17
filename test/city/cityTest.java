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

public class cityTest {
	City city;

	@Before
	public void setup() {
		city = new City("C1", 6, 10);
	}

	@Test
	public void cityconstractorwithThreeFields() {
		assertEquals(10, city.getNbInHabitants());
		assertEquals(6, city.getNbDay());
		assertEquals("C1", city.getCityName());
		assertEquals(10, city.getInHAbiatantsList().size());
	}

	@Test
	public void cityConstractorWithTowFields() {
		city = new City("C1");
		city.getInHAbiatantsList();
		city.setNbDay(6);
		city.setNbInHabitants(10);
		assertEquals(10, city.getNbInHabitants());
		assertEquals(6, city.getNbDay());
		assertEquals("C1", city.getCityName());

	}
	@Test
	public void getInHAbiatantsListTest(){	
		assertFalse(city.getInHAbiatantsList().isEmpty());
		assertEquals(10,  city.getInHAbiatantsList().size());
		

	}
	@Test
	public void getRandomInhabitantTest() {
		
		Inhabitant inhabitant = city.getRandomInhabitant(city.getNbInHabitants());
		assertFalse(city.getInHAbiatantsList().isEmpty());
	}
	@Test
	public void getRandomLetterTest()  {		
		Letter letter = city.getRandomLetter() ;
		assertEquals("simple letter",city.getRandomLetter().typeOfLetterDescription() );
		assertEquals(1,city.getRandomLetter().getCost() );
	}
	@Test
	public void  sendLetterTest() {		
		List<Letter<?>> box = city.sendLetter();
		assertFalse(box.isEmpty());
		//assertTrue(box.size()>=3 && box.size()<=7 );
	}
	@Test
	public void sendLetterWithFieldTest() {
		city.sendLetter(city.getRandomLetter());
		assertTrue(city.postbox.size()==1);
	}

}
