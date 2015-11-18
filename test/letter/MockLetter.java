package letter;

import content.*;

public class MockLetter extends Letter<Text> {
	protected MockInhabitant sender;
	protected MockInhabitant receiver;

	public MockLetter(MockInhabitant sender, MockInhabitant receiver, Text cont) {
		super(sender, receiver, cont);
		this.sender = sender;
		this.receiver = receiver;
	}

	@Override
	public void action() {
		this.receiver.addLetterSend();
	}

	@Override
	public int getCost() {
		return 0;
	}

	@Override
	public String typeOfLetterDescription() {
		return null;
	}

}
