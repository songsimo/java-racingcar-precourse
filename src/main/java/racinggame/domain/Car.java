package racinggame.domain;

public class Car {
	private Name name;
	private Mileage mileage;

	public Car(String name) {
		this.name = new Name(name);
		this.mileage = new Mileage(0);
	}

	public Car(String name, int mileage) {
		this.name = new Name(name);
		this.mileage = new Mileage(mileage);
	}

	public Car drive(int value) {
		Engine engine = new Engine(value);

		mileage = mileage.add(new Mileage(engine.getStep()));

		return this;
	}

	public String getName() {
		return name.getName();
	}

	public int getMileage() {
		return mileage.distance();
	}
}
