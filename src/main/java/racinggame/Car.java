package racinggame;

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

	public void drive(int value) {
		Engine engine = new Engine(value);

		mileage = mileage.add(new Mileage(engine.getStep()));
	}

	public String getName() {
		return name.getName();
	}

	public int getMileage() {
		return mileage.distance();
	}
}
