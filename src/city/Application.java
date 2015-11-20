package city;

import letter.Letter;
import random.RandomForApplication;

/**
 * 
 * this class contains the main method it uses a city object to simulate sending
 * and receiving letters all these actions are displayed using display method
 * 
 * @author addou
 * 
 */

public class Application{
	protected int nbDay;
	protected City city;
	
	/*
	 * the inhabitant number should be superior to 2
	 * this application is defined
	 * by the name of the city, the number of days to will be simulate, the number of inhabitants
	 */
	public Application(String cityName, int nbDay, int nbInhabitants) {
		city = new City(cityName);
		if (nbInhabitants < 2)
			throw new IllegalArgumentException("the number of inhabitant have to be at least 2");
		this.nbDay = nbDay;
		for (int i = 1; i <= nbInhabitants; i++) {			
			this.city.addInHabitant(new InhabitantWithPrint("inhabitant-"+i, this.city, new BankAccount(5000)));
		}
	}
	
	
	/*
	 * For each day this method display the sents and received letters
	 */
	public void display() {

		System.out.println("Mailing letters for " + getNbDay() + " days"); 
		System.out.println("*************************************");
		int nb = 1;
		for (int i = 0; i < nbDay; i++) {
			System.out.println("Day" + (nb));
			
			this.city.distributeLetters();
			CompletePostbox();
			
			System.out.println("*************************************");
			nb++;
		}
		while (!city.postBox.isEmpty()){
			System.out.println("Day" + (nb));
			
			this.city.distributeLetters();
			
			System.out.println("*************************************");
		}
		
		
	}

	/*
	 * complete the city box by randoms letters
	 */
	public void  CompletePostbox() {		
		int nbLetter = 3+(int) (Math.random()*7);
		for (int i = 0; i < nbLetter; i++) {
			Letter<?> letter = RandomForApplication.getRandomLetter(this.city);
			letter.getSender().sendLetter(letter);
		}
	}


	public int getNbDay() {
		return nbDay;
	}


	public static void main(String[] args) {
		Application appli = new Application("lille", 6, 100);
		appli.display();
	}
}
