package letter;

import content.Money;
import content.Text;
import city.Inhabitant;
 
/**
 * 
 */

/**
 * @author negmi
 *
 */
public class PromissoryNote extends Letter<Money>{
	
    public PromissoryNote( Inhabitant receiver, Inhabitant sender, Money content   ) {
    	super (sender , receiver, content);
	}

  
	@Override
	public int getCost() {
 
		return  SimpleLetter.cost + (int)((content.getAmount())/100);
	}
	 

	@Override
	public String typeOfLetterDescription() {	 
		return "a Promissory note";
	}
	
	
	@Override
	public void action() {
		this.sender.debit(content.getAmount());
		this.receiver.credit(content.getAmount());
		SimpleLetter thankyouLetter = new SimpleLetter(this.receiver,this.sender,new Text("thank you :)"));
		this.receiver.getCity().sendLetter(thankyouLetter);
	}
}