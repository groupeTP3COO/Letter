/**
 * 
 */
package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import city.City;
import city.Inhabitant;
import content.Money;
import content.Text;
import letter.Letter;
import letter.PromissoryNote;
import letter.RegisteredLetter;
import letter.SimpleLetter;
import letter.UrgentLetter;

/**
 * @author user
 *
 */
public class RandomForApplication {

	public static Letter<?> getRandomLetter(City city){
		Inhabitant sender = RandomForApplication.getRandomInhabitant(city);
		Inhabitant receiver = RandomForApplication.getRandomInhabitant(city);
		while(sender.getName()== receiver.getName())
			receiver = RandomForApplication.getRandomInhabitant(city);
		List<Letter<?>> letterList = new ArrayList<Letter<?>>();
		letterList.add(new SimpleLetter( sender, receiver, new Text("bla bla")));
		letterList.add(new PromissoryNote( sender, receiver, new Money(new Random().nextInt(500))));
		letterList.add(new UrgentLetter(getRandomLetterForUrgentLetter(city)));
		letterList.add(new RegisteredLetter(getRandomLetterForRegisteredLetter(city)));	
		int randomLetter = new Random().nextInt(letterList.size());
		return letterList.get(randomLetter);
	}
	
	
	public static Letter<?> getRandomLetterForUrgentLetter(City city){
		Inhabitant sender = RandomForApplication.getRandomInhabitant(city);
		Inhabitant receiver = RandomForApplication.getRandomInhabitant(city);
		while(sender.getName()== receiver.getName())
			receiver = RandomForApplication.getRandomInhabitant(city);
		List<Letter<?>> letterList = new ArrayList<Letter<?>>();
		letterList.add(new SimpleLetter( sender, receiver, new Text("bla bla")));
		letterList.add(new PromissoryNote( sender, receiver, new Money(new Random().nextInt(500))));
		letterList.add(new RegisteredLetter(new SimpleLetter( sender, receiver, new Text("bla bla"))));
		letterList.add(new RegisteredLetter(new PromissoryNote( sender, receiver, new Money(new Random().nextInt(500)))));
		int randomLetter = new Random().nextInt(letterList.size());
		return letterList.get(randomLetter);
	}
	
	
	
	public static Letter<?> getRandomLetterForRegisteredLetter(City city){
		Inhabitant sender = RandomForApplication.getRandomInhabitant(city);
		Inhabitant receiver = RandomForApplication.getRandomInhabitant(city);
		while(sender.getName()== receiver.getName())
			receiver = RandomForApplication.getRandomInhabitant(city);
		List<Letter<?>> letterList = new ArrayList<Letter<?>>();
		letterList.add(new SimpleLetter( sender, receiver, new Text("bla bla")));
		letterList.add(new PromissoryNote( sender, receiver, new Money(new Random().nextInt(500))));
		letterList.add(new UrgentLetter(new SimpleLetter( sender, receiver, new Text("bla bla"))));
		letterList.add(new UrgentLetter(new PromissoryNote( sender, receiver, new Money(new Random().nextInt(500)))));	
		int randomLetter = new Random().nextInt(letterList.size());
		return letterList.get(randomLetter);
	}

	
	public static Inhabitant getRandomInhabitant(City city) {		
		int nb =  new Random().nextInt(city.getNbInHabitants());		
		return city.getInhabitants().get(nb);
		
	}

}
