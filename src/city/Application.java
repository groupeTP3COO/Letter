package city;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import content.Text;

import letter.Letter;
import letter.RegisteredLetter;
import letter.SimpleLetter;

public class Application extends City {
	protected int nbDay;
	
	public Application(String cityName, int nbDay, int nbInhabitants) {
		super(cityName);
		if (nbInhabitants < 2)
			throw new IllegalArgumentException("the number of inhabitant have to be at least 2");
		this.nbDay = nbDay;
		for (int i = 1; i <= nbInhabitants; i++) {			
			this.addInHabitant(new Inhabitant("inhabitant-"+i, this, new BankAccount(5000)));
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
			System.out.println("<-"+letter.toString());
		}
		super.distributeLetters();
	}
	
	/*
	 * @see city.City#sendLetter(letter.Letter)
	 */
	@Override
	public void sendLetter(Letter<?> letter) {
		System.out.println("->"+letter.toString());
		super.sendLetter(letter);
	}

	public Letter<?> getRandomLetter(){
		List<Letter<?>> letterList = new ArrayList<>();
		Inhabitant sender = this.getRandomInhabitant();
		Inhabitant receiver = this.getRandomInhabitant();
		while(sender.getName()== receiver.getName())
			receiver = this.getRandomInhabitant();
		
		letterList.add(new SimpleLetter( sender, receiver, new Text("simple1")));
		letterList.add(new SimpleLetter( sender, receiver, new Text("simple2")));
	
		letterList.add(new RegisteredLetter(new SimpleLetter( sender, receiver, new Text("simple1"))));
			
		int randomLetter = new Random().nextInt(3);
		return letterList.get(randomLetter);
	}
	
	public void  CompletePostbox() {		
		int nbLetter = 3+(int) (Math.random()*7);
		for (int i = 0; i < nbLetter; i++) {
			sendLetter(getRandomLetter());
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
