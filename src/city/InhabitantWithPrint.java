/**
 * 
 */
package city;

import letter.Letter;

/**
 * @author user
 *
 *         this class represents an inhabitant and print of the standard output
 *         the actions are made
 */
public class InhabitantWithPrint extends Inhabitant {

	public InhabitantWithPrint(String name, City city, BankAccount bankaccount) {
		super(name, city, bankaccount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void credit(int amount) {
		super.credit(amount);
		System.out.println("\t+ " + amount + " euros are debited from " + this.getName() + " whose balance is now "
				+ this.getAmountOfBankaccount() + " euros");
	}

	@Override
	public void debit(int amount) {
		super.debit(amount);
		System.out.println("\t- " + amount + " euros are debited from " + this.getName() + " whose balance is now "
				+ this.getAmountOfBankaccount() + " euros");
	}

	@Override
	public void sendLetter(Letter<?> letter) {
		System.out.println("-> " + letter.getSender().getName() + " mail " + letter.toString() + " to "
				+ letter.getReceiver().getName() + " for a cost of " + letter.getCost() + " euros");
		super.sendLetter(letter);
	}

	@Override
	public void receiveLetter(Letter<?> letter) {
		System.out.println("<- " + letter.getReceiver().getName() + " receives " + letter.toString() + " to "
				+ letter.getSender().getName() + " for a cost of " + letter.getCost() + " euros");
		super.receiveLetter(letter);
	}

}
