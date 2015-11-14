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
	protected List<Letter<?>> postbox;
	protected List<Letter<?>> lastDayBox;
	protected List<Inhabitant> inhabitants;
	protected int nbDay;
	protected int nbInHabitants;

	public City(String cityName, int nbDay, int nbInHabitants) {

		this.cityName = cityName;
		this.postbox = new ArrayList<>();		
		this.inhabitants = getInHAbiatantsList();
		this.nbDay = nbDay;

	}

	public City(String cityName, int nbDay) {

		this.cityName = cityName;		
		this.nbDay = nbDay;

	}

	private List<Inhabitant> getInHAbiatantsList() {		
		List<Inhabitant> list = new ArrayList<>();
		for (int i = 0; i < nbInHabitants; i++) {			
			list.add(new Inhabitant("inhabitant-"+i));
		}
		return list;
	}
	public Letter getRandomLetter(){
		List<Letter<?>> letterList = new ArrayList<>();
		letterList.add(new SimpleLetter( getRandomInhabitant(), getRandomInhabitant()));
		letterList.add(new acknowledgementOfReceipt( new RegisteredLetter(getRandomInhabitant(),getRandomInhabitant())));
		letterList.add(new PromissoryNote(getRandomInhabitant(),getRandomInhabitant()));
		int randomLetter = new Random().nextInt(3);
		return letterList.get(randomLetter);
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	
	public List<Letter<?>> getPostbox() {
		postbox = new ArrayList<>();
		int r = (int) (Math.random() * 10);
		for (int i = 0; i < r; i++) {
			postbox.add(getRandomLetter());
		}
		return postbox;
	}

	
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	public void setInhabitants(List<Inhabitant> inhabitants) {
		this.inhabitants = inhabitants;
	}

	public int getNbDay() {
		return nbDay;
	}

	public void setNbDay(int nbDay) {
		this.nbDay = nbDay;
	}

	public void sendLetter(Letter letter) {
		this.postbox.add(letter);
	}

	// public distributeLetters(){
	
	// }
	public void display() {

		System.out.println("Mailing letters for " + this.getNbDay() + " days");
		System.out.println("*************************************");

		for (int i = 0, nb = 1; i < nbDay; i++) {
			System.out.println("Day" + (nb));
			this.displayList(postbox);
			System.out.println("*************************************");
			nb++;

		}
	}

	public Inhabitant getRandomInhabitant() {
		
			return this.inhabitants.get(getRandInt());
		
	}
	
	private int getRandInt() {
		return (int) (Math.random() * 100);
	}
	
	public void displayList(List<Letter<?>> list){		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("->"+list.get(i).getSender()+"mails"+list.get(i).toString()+list.get(i).getReceiver());
		}
	}
	

}
