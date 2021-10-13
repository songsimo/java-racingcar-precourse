package racinggame.domain;

public class Mileage {
	private int mileage;

	public Mileage(int mileage) {
		this.mileage = mileage;
	}

	public Mileage add(Mileage other) {
		return new Mileage(this.mileage + other.mileage);
	}

	public int distance() {
		return mileage;
	}
}
