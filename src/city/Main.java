package city;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import letter.Letter;
import letter.PromissoryNote;
import letter.RegisteredLetter;
import letter.SimpleLetter;
import letter.acknowledgementOfReceipt;

import city.City;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	City city = new City("C1", 6,100);		
	city.display();
	
		
	
	}

}
