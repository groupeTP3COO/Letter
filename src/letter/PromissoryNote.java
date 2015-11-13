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
	
	protected int amount;
	/* the cost of the Promissory note*/
	protected int cost ;
	 
	
    public PromissoryNote( Inhabitant receiver, Inhabitant sender, Money content   ) {
		
    	super (sender , receiver, content);
    	this.amount=this.content.amount;
		this.cost= cost;
		 
	}

	@Override
	public void action() {
		 
		this.receiver.credit(amount);    
		this.sender.debit(amount);
		SimpleLetter thankyou = new SimpleLetter(this.receiver,this.sender,new Text("thank you :) "));
		this.receiver.sendLetter(thankyou);
	
	}
	
	
    public int getCostEuros(){
	return this.costEuros;
    }
    
	@Override
	public int getCost() {
 
		return  1+ (int)((amount)/100);;
	}

	 

	@Override
	public String typeOfLetterDescription() {
		 
		return "this letter is a: **  Promissory note ** ";;
	}