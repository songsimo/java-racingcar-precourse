package racinggame;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
	private final List<Car> cars;

	public Cars(List<Car> cars) {
		validDuplicationName(cars);
		this.cars = cars;
	}

	private void validDuplicationName(List<Car> cars) {
		Set<String> carSet = new HashSet<>();

		for(Car car: cars) {
			carSet.add(car.getName());
		}

		if(carSet.size() != cars.size()) {
			throw new IllegalArgumentException("자동차의 이름은 중복을 허용하지 않습니다.");
		}
	}

	public PlayResult drive(NumberGenerator generator) {
		PlayResult result = new PlayResult();

		for(Car car: cars) {
			result.report(car.drive(generator.generateNumber()));
		}

		return result;
	}

	public PlayResult getWinners() {
		int maxMileage = getMaxMileage();
		PlayResult result = new PlayResult();

		for(Car car: cars) {
			addCarGreaterThanNumber(result, car, maxMileage);
		}

		return result;
	}

	private int getMaxMileage() {
		int max = 0;

		for(Car car: cars) {
			max = compareMax(car.getMileage(), max);
		}

		return max;
	}

	private int compareMax(int compareNumber, int maxNumber) {
		return Math.max(compareNumber, maxNumber);
	}

	private void addCarGreaterThanNumber(PlayResult result, Car car, int maxNumber) {
		if(car.getMileage() == maxNumber) {
			result.report(car);
		}
	}
}
