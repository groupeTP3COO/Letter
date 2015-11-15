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
		city = new City("C1", 6, 2);
	}

	@Test
	public void cityconstractorwithThreeFields() {
		assertEquals(2, city.getNbInHabitants());
		assertEquals(6, city.getNbDay());
		assertEquals("C1", city.getCityName());
		assertEquals(2, city.getInHAbiatantsList().size());
	}

	@Test
	public void cityconstractorwithTowFields() {
		city = new City("C1");
		city.getInHAbiatantsList();
		city.setNbDay(6);
		city.setNbInHabitants(2);
		assertEquals(2, city.getNbInHabitants());
		assertEquals(6, city.getNbDay());
		assertEquals("C1", city.getCityName());

	}
	
	public void getRandomInhabitantTest() {
		List<Inhabitant> list = city.getInHAbiatantsList();
		assertTrue(list.isEmpty());

	}

}
