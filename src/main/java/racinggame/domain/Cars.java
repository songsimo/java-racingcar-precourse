package racinggame.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import racinggame.NumberGenerator;
import racinggame.common.ValueError;

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
			throw new IllegalArgumentException(ValueError.DUPLICATE_CAR_NAME.getMessage());
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
