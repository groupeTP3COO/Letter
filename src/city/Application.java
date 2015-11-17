package city;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import content.Text;

import letter.Letter;
import letter.RegisteredLetter;
import letter.SimpleLetter;

public class Application {
	protected City city;
	protected int nbDay;
	protected int nbInhabitants;
	
	public Application(City city, int nbDay, int nbInhabitants) {
		super();
		this.city = city;
		this.nbDay = nbDay;
		this.nbInhabitants = nbInhabitants;
		city.inHabitantsList = this.getInHAbiatantsList();
	}
	
	public  List<Inhabitant> getInHAbiatantsList() {		
		
		List<Inhabitant> list = new ArrayList<>();
		for (int i = 1; i <= nbInhabitants; i++) {			
			list.add(new Inhabitant("inhabitant-"+i));
		}
		return list;
	}
	
	public Inhabitant getRandomInhabitant() {		
		int nb =  new Random().nextInt(this.nbInhabitants);		
			return this.getInHAbiatantsList().get(nb);		
	}
	
	public int getNbInHabitants() {
		return nbInhabitants;
	}
	
	
	public void display() {

		System.out.println("Mailing letters for " + getNbDay() + " days"); 
		System.out.println("*************************************");

		for (int i = 0, nb = 1; i < nbDay; i++) {
			System.out.println("Day" + (nb));
			
			//distributeLetters();
			CompletePostbox();
			displaySendLetter(city.postbox);
			
			
			System.out.println("*************************************");
			city.postbox=null;
			nb++;
		}
		//city.lastDayBox =city.postbox;
		
	}
	
	public void displaySendLetter(List<Letter<?>> list){		
		for (Letter<?> letter : city.postbox) {
			System.out.println("->"+letter.getSender().name+letter.toString()+letter.getReceiver().name);
			
		}
		
		
	}
	public  void displayDistributeLetters(){		
		
		for (Letter<?> letter : city.lastDayBox) {
			System.out.println("<-"+letter.getReceiver().name+letter.toString()+letter.getSender().name);
		}
	}
	
	public Letter<?> getRandomLetter(){
		List<Letter<?>> letterList = new ArrayList<>();
		letterList.add(new SimpleLetter( getRandomInhabitant(), getRandomInhabitant(), new Text("simple1")));
		letterList.add(new SimpleLetter( getRandomInhabitant(), getRandomInhabitant(), new Text("simple2")));
	
		letterList.add(new RegisteredLetter(new SimpleLetter( getRandomInhabitant(), getRandomInhabitant(), new Text("simple1"))));
			
		int randomLetter = new Random().nextInt(3);
		return letterList.get(randomLetter);
	}
	
	public List<Letter<?>>  CompletePostbox() {		
		int nbLetter = 3+(int) (Math.random()*7);
		for (int i = 0; i < nbLetter; i++) {
			city.postbox.add(getRandomLetter());
		}
		return city.postbox;
		
	}
	
	
	public City getCity() {
		return city;
	}


	public int getNbDay() {
		return nbDay;
	}


	public static void main(String[] args) {
		City city = new City();
		Application appli = new Application(city, 6, 100);
		appli.display();
	}
}
