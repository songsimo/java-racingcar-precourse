package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class PlayResult {
	private List<Car> cars = new ArrayList<>();

	public void report(Car car) {
		cars.add(car);
	}

	public List<Car> getResult() {
		return cars;
	}
}
