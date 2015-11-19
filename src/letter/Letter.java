package letter;
import content.Content;
import city.Inhabitant;

/**
 * 
 * @author negmi
 *
 */

public abstract class Letter <T extends Content> implements Content{
	
	 
	 
	protected  T content;
	protected Inhabitant sender ;	 
	protected Inhabitant receiver ;
	 
	//The constructor
	public Letter (Inhabitant sender ,Inhabitant receiver ,T cont ){

		this.sender=sender;
		this.receiver=receiver ;
		this.content=cont;	
	} 
	
   // Methods 
	public abstract void action() ;
	
	public abstract int getCost() ;
	
	public T getContent(){
		return this.content ;
		
	}

	 
	public Inhabitant getSender() {
		return sender;
	}
	 

	public Inhabitant getReceiver() {
		return receiver;
	}
	
	public abstract String typeOfLetterDescription();
	
	
	public String toString() {
		return typeOfLetterDescription()+" whose contains is "+content.toString();
	
	}
	
}	