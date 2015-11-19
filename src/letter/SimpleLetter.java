package letter;
import city.*;
import content.*;


public class SimpleLetter extends Letter<Text>{	

	protected final static int cost = 1;
	protected Text cont;
	public SimpleLetter(Inhabitant sender, Inhabitant receiver,Text cont){
		super(sender,receiver,cont);
	}
	/**
	 * @return the cost of a simpleLetter
	 */
	public int getCost(){
		return cost;
	}
	

	public void action(){
	}

	/**
	 * @return the type of the letter
	 */
	public String typeOfLetterDescription(){
		return "a simple letter";
	}
}