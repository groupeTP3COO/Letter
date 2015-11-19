package letter;

import content.Money;
import content.Text;
import city.Inhabitant;
 
/**
 * @author negmi
 *
 */
public class PromissoryNote extends Letter<Money>{
	
	
    public PromissoryNote( Inhabitant receiver, Inhabitant sender, Money content   ) {
    	super (sender , receiver, content);
	}

    /**
	 * @return the cost of a simple letter plus 1% of the amount sent.
	 */
	@Override
	public int getCost() {
 
		return  SimpleLetter.cost + (int)((content.getAmount())/100);
	}
	 
	/**
	 * @return the type of the letter 
	 */
	@Override
	public String typeOfLetterDescription() {	 
		return "a Promissory note";
	}
	
	

	/**
	 * transfers money from the sender to the receiver.
	 * After that, the receiver send a thankful letter
	 */
	@Override
	public void action() {
		this.sender.debit(content.getAmount());
		this.receiver.credit(content.getAmount());
		SimpleLetter thankyouLetter = new SimpleLetter(this.receiver,this.sender,new Text("thank you :)"));
		this.receiver.sendLetter(thankyouLetter);
	}
}