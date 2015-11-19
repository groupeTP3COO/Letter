package city;

import letter.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Town class This class groups different type of letters and distributes them
 * the next day
 * 
 * @author addou
 * 
 */

public class City {
	protected String cityName;
	protected List<Letter<?>> postBox = new ArrayList<Letter<?>>();
	protected int nbInHabitants;
	protected List<Inhabitant> inhabitants;

	public City(String cityName) {

		this.cityName = cityName;
		this.nbInHabitants = 0;
		this.inhabitants = new ArrayList<Inhabitant>();

	}

	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	public String getCityName() {
		return cityName;
	}

	public int getNbInHabitants() {
		return nbInHabitants;
	}

	/*
	 * add inhabitants to the city inhabitant list
	 */

	public void addInHabitant(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
		this.nbInHabitants++;
	}

	/*
	 * add a random letter to the city post box the inhabitants count is debited
	 * according to the letter
	 */

	public void sendLetter(Letter<?> letter) {
		this.postBox.add(letter);
		letter.getSender().debit(letter.getCost());
	}

	/*
	 * display all letters of last day and remove them of the post box
	 */

	public void distributeLetters() {
		List<Letter<?>> yesterdayPostBox = new ArrayList<>();
		yesterdayPostBox.addAll(this.postBox);
		this.postBox.clear();
		for (Letter<?> letter : yesterdayPostBox) {
			letter.getReceiver().receiveLetter(letter);
			this.postBox.remove(letter);
		}

	}

}
