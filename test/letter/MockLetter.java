package letter;		
		
import city.Inhabitant;
import content.*;		
		
public class MockLetter extends Letter<Text> {		
	
	Boolean actionWasDo = false;
		
	public MockLetter(Inhabitant sender, Inhabitant receiver, Text cont) {		
		super(sender, receiver, cont);		
		this.sender = sender;		
		this.receiver = receiver;		
	}		
		
	@Override		
	public void action() {		
		this.actionWasDo = true;		
	}		
		
	@Override		
	public int getCost() {		
		return 1;		
	}		
		
	@Override		
	public String typeOfLetterDescription() {		
		return null;		
	}

	public Boolean getActionWasDo() {
		return actionWasDo;
	}		
		
}