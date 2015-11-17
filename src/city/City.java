package city;
import letter.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author addou
 * 
 */
public class City {
	protected String cityName;
	protected List<Letter<?>> postBox = new ArrayList<Letter<?>>();
	protected int nbInHabitants;
	protected List<Inhabitant> inhabitants;

	public City(String cityName, List<Inhabitant> inhabitants) {

		this.cityName = cityName;	
		this.nbInHabitants = inhabitants.size();
		this.inhabitants = inhabitants;

	}
	
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
	
	
	public void addInHabitant(Inhabitant inhabitant){
		this.inhabitants.add(inhabitant);
		this.nbInHabitants++;
	}

	public void sendLetter(Letter<?> letter) {
		this.postBox.add(letter);
		letter.getSender().getBankaccount().debit(letter.getCost());
	}
	
	public void distributeLetters(){
		List<Letter<?>> yesterdayPostBox = this.postBox;
		this.postBox.clear();
		for (Letter<?> letter : yesterdayPostBox) {
			letter.action();
		}
		
	}
	
	public Inhabitant getRandomInhabitant() {		
		int nb =  new Random().nextInt(this.nbInHabitants);		
		return this.inhabitants.get(nb);		
	}

}
