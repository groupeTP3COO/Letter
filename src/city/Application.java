package city;

import letter.Letter;
import random.RandomForApplication;

public class Application extends City {
	protected int nbDay;
	
	public Application(String cityName, int nbDay, int nbInhabitants) {
		super(cityName);
		if (nbInhabitants < 2)
			throw new IllegalArgumentException("the number of inhabitant have to be at least 2");
		this.nbDay = nbDay;
		for (int i = 1; i <= nbInhabitants; i++) {			
			this.addInHabitant(new InhabitantWithPrint("inhabitant-"+i, this, new BankAccount(5000)));
		}
	}
	
	public void display() {

		System.out.println("Mailing letters for " + getNbDay() + " days"); 
		System.out.println("*************************************");

		for (int i = 0, nb = 1; i < nbDay; i++) {
			System.out.println("Day" + (nb));
			
			distributeLetters();
			CompletePostbox();
			
			System.out.println("*************************************");
			nb++;
		}
		//city.lastDayBox =city.postbox;
		
	}
	
	@Override
	public void distributeLetters(){
		for (Letter<?> letter : this.postBox) {
			System.out.println("<- "+letter.getReceiver().getName()+" receives "+letter.toString()+" to "+letter.getSender().getName() + " for a cost of "+letter.getCost()+" euros");
		}
		super.distributeLetters();
	}
	
	/*
	 * @see city.City#sendLetter(letter.Letter)
	 */
	@Override
	public void sendLetter(Letter<?> letter) {
		System.out.println("-> "+letter.getSender().getName()+" mail "+letter.toString()+" to "+letter.getReceiver().getName() + " for a cost of "+letter.getCost()+" euros");
		super.sendLetter(letter);
	}

	
	public void  CompletePostbox() {		
		int nbLetter = 3+(int) (Math.random()*7);
		for (int i = 0; i < nbLetter; i++) {
			sendLetter(RandomForApplication.getRandomLetter(this));
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
