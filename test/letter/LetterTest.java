package letter;



import city.*;
import content.Content;

public abstract class LetterTest <T extends Content> implements Content {

	Inhabitant receiver = new Inhabitant("toto",new City("c1",2), new BankAccount(5000));
	Inhabitant sender = new Inhabitant("titi",new City("c1",2),new BankAccount(5000));
	
	protected abstract Letter<?> createLetter();
	
	
	
}