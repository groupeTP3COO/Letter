package letter;
import city.*;
import content.*;


public class SimpleLetter extends Letter<Text>{	

	protected int cost;
	
	public SimpleLetter(Inhabitant sender, Inhabitant receiver,Text cont){
		super(sender,receiver,cont);
		this.cost = 1;
	}

	

	public int getCost(){
		return this.cost;
	}
	

	public void action(){
		this.getSender().getBankaccount().debit(1);
	}

	
	public String typeOfLetterDescription(){
		return "simple letter";
	}


}