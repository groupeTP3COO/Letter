package letter;

import city.*;


public class MockInhabitant extends Inhabitant {

	public int numberOfLetterSent;
	
	public MockInhabitant(String name, City city,BankAccount bankaccount) {
		super(name, city,bankaccount);
		numberOfLetterSent = 0;
	}
	

}
