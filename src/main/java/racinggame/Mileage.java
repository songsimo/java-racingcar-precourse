package racinggame;

public class Mileage {
	private int mileage;

	public Mileage(int mileage) {
		this.mileage = mileage;
	}

	public void add(EngineStatus status) {
		if(status.isStart()) {
			mileage += 1;
		}
	}

	public int distance() {
		return mileage;
	}
}
