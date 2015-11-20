package city;

import letter.Letter;

/**
 * 
 * this class is a simple inhabitant to tests other class
 *
 */

public class MockInhabitant extends Inhabitant {

	protected int numberOfLetterSent;
	protected Boolean letterIsReceived = false;

	public MockInhabitant(String name, City city, BankAccount bankaccount) {
		super(name, city, bankaccount);
		numberOfLetterSent = 0;
	}

	public void sendLetter(Letter<?> letter) {
		super.sendLetter(letter);
		this.numberOfLetterSent++;
	}

	@Override
	public void receiveLetter(Letter<?> letter) {
		this.letterIsReceived = true;
	}

	public Boolean getLetterIsReceived() {
		return letterIsReceived;
	}

	public int getNumberOfLetterSent() {
		return numberOfLetterSent;
	}

}
