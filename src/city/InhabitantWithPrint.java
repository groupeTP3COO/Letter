/**
 * 
 */
package city;

/**
 * @author user
 *
 */
public class InhabitantWithPrint extends Inhabitant {

	public InhabitantWithPrint(String name, City city, BankAccount bankaccount) {
		super(name, city, bankaccount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void credit(int amount) {
		super.credit(amount);
		System.out.println("\t- "+amount+ " euros are debited from "+this.getName()+ " whose balance is now "+this.getAmountOfBankaccount()+ "euros");
	}

	@Override
	public void debit(int amount) {
		super.debit(amount);
		System.out.println("\t+ "+amount+ " euros are debited from "+this.getName()+ " whose balance is now "+this.getAmountOfBankaccount()+ "euros");
	}
	
	
}
