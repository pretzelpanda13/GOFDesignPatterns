package designpattern.creational.Factory;

public class BearFactory {

	public Bear selectBear(BearType bearName) {
		switch (bearName) {
		case PANDA:
			return new Panda();
		case POLARBEAR:
			return new PolarBear();
		default:
			return new antiBear();
		}
	}

}
