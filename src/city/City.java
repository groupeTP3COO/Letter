package city;
import letter.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import content.*;

/**
 * @author addou
 * 
 */
public class City {
	protected String cityName;
	protected List<Letter<?>> postbox = new ArrayList<>();
	protected List<Letter<?>> lastDayBox = new ArrayList<>();		
	protected List<Inhabitant> inHabitantsList;

	public City() {			
		

	}

	public City(String cityName) { 
		this.cityName = cityName;
	}
	

	public String getCityName() {
		return cityName;
	}
		

	
	public void sendLetter(Letter letter) {
		this.postbox.add(letter);
		//letter.getSender().getBankaccount().debit(letter.getCost());
	}
	
	
	public void distributeLetters(){
		
		for (Letter<?> lettre : this.lastDayBox) {
			lettre.action();
			this.lastDayBox.remove(lettre);
		}
	}

	public List<Letter<?>> getPostbox() {
		return postbox;
	}

	public List<Letter<?>> getLastDayBox() {
		return lastDayBox;
	}

	public List<Inhabitant> getInHabitantsList() {
		return inHabitantsList;
	}

	

}
