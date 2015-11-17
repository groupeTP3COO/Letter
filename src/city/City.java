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
	protected int nbDay;
	protected int nbInHabitants;

	public City(String cityName, int nbDay, int nbInHabitants) {

		this.cityName = cityName;	
		this.nbDay = nbDay;
		this.nbInHabitants = nbInHabitants;

	}

	public City(String cityName) { 
		this.cityName = cityName;
	}
	

	public  List<Inhabitant> getInHAbiatantsList() {		
		List<Inhabitant> list = new ArrayList<>();
		for (int i = 1; i <= nbInHabitants; i++) {			
			list.add(new Inhabitant("inhabitant-"+i));
		}
		return list;
	}
	
	public Inhabitant getRandomInhabitant(int integer) {		
		int nb =  new Random().nextInt(integer);		
			return this.getInHAbiatantsList().get(nb);		
	}
	
	public Letter<?> getRandomLetter(){
		List<Letter<?>> letterList = new ArrayList<>();
		letterList.add(new SimpleLetter( getRandomInhabitant(nbInHabitants), getRandomInhabitant(nbInHabitants), new Text("simple1")));
		letterList.add(new SimpleLetter( getRandomInhabitant(nbInHabitants), getRandomInhabitant(nbInHabitants), new Text("simple2")));
		letterList.add(new SimpleLetter( getRandomInhabitant(nbInHabitants), getRandomInhabitant(nbInHabitants), new Text("bla bla")));
		
		/***** Il faut revoir les constructeurs des deux lettres(il y a un probleme de compilation)et le toString de la classe SimpleLetter
		//letterList.add(new RegisteredLetter(getRandomLetter()));
		//letterList.add(new PromissoryNote(getRandomInhabitant(nbInHabitants),getRandomInhabitant(nbInHabitants), new Money(new Random().nextInt(1000))));
		*******/
		
		int randomLetter = new Random().nextInt(3);
		return letterList.get(randomLetter);
	}

	public String getCityName() {
		return cityName;
	}
	
	public List<Letter<?>>  CompletePostbox() {		
		int nbLetter = 3+(int) (Math.random()*7);
		for (int i = 0; i < nbLetter; i++) {
			postbox.add(getRandomLetter());
		}
		return postbox;
	}	

	public void sendLetter(List<Letter<?>> list){		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("->"+list.get(i).getSender()+list.get(i).toString()+list.get(i).getReceiver());
		}
	}
	public void distributeLetters(){
		
		for (int i = 0; i < lastDayBox.size(); i++) {
			System.out.println("<-"+this.lastDayBox.get(i).getReceiver()+this.lastDayBox.get(i).toString()+this.lastDayBox.get(i).getSender());
		}
	}
	public void display() {

		System.out.println("Mailing letters for " + this.getNbDay() + " days");
		System.out.println("*************************************");

		for (int i = 0, nb = 1; i < nbDay; i++) {
			System.out.println("Day" + (nb));
			
			this.distributeLetters();
			this.CompletePostbox();
			this.sendLetter(postbox);
			
			System.out.println(this.postbox.get(0).toString());
			System.out.println("*************************************");
			
			nb++;
		}
		this.lastDayBox =this.postbox;
		
	}

	public List<Letter<?>> getLastDayBox() {
		return lastDayBox;
	}

	public int getNbInHabitants() {
		return nbInHabitants;
	}
	public void setNbInHabitants(int nbInHabitants) {
		this.nbInHabitants = nbInHabitants;
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

}
