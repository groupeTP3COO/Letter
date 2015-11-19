package city;

import random.RandomForApplication;

public class Application{
	protected int nbDay;
	protected City city;
	
	public Application(String cityName, int nbDay, int nbInhabitants) {
		city = new City(cityName);
		if (nbInhabitants < 2)
			throw new IllegalArgumentException("the number of inhabitant have to be at least 2");
		this.nbDay = nbDay;
		for (int i = 1; i <= nbInhabitants; i++) {			
			this.city.addInHabitant(new InhabitantWithPrint("inhabitant-"+i, this.city, new BankAccount(5000)));
		}
	}
	
	public void display() {

		System.out.println("Mailing letters for " + getNbDay() + " days"); 
		System.out.println("*************************************");

		for (int i = 0, nb = 1; i < nbDay; i++) {
			System.out.println("Day" + (nb));
			
			this.city.distributeLetters();
			CompletePostbox();
			
			System.out.println("*************************************");
			nb++;
		}
		
	}

	
	public void  CompletePostbox() {		
		int nbLetter = 3+(int) (Math.random()*7);
		for (int i = 0; i < nbLetter; i++) {
			RandomForApplication.getRandomInhabitant(this.city).sendLetter(RandomForApplication.getRandomLetter(this.city));
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
