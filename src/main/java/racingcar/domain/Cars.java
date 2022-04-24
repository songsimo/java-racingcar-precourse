package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

import racingcar.dto.CarStatus;
import racingcar.dto.GameResult;

public class Cars {
	private List<Car> cars = new ArrayList<>();

	public Cars(List<Car> cars) {
		this.cars.addAll(cars);
	}

	public GameResult getWinners() {
		GameResult gameResult = new GameResult();
		int maxDistance = getMaxDistance();

		for(Car car: cars) {
			addWinnerCar(gameResult, maxDistance, car);
		}
		return gameResult;
	}

	private void addWinnerCar(GameResult gameResult, int maxDistance, Car car) {
		if(car.isEqualDistance(maxDistance)) {
			gameResult.add(CarStatus.of(car.getName(), car.getDistance()));
		}
	}

	private int getMaxDistance() {
		int maxDistance = 0;

		for(Car car: cars) {
			maxDistance = max(car, maxDistance);
		}

		return maxDistance;
	}

	private int max(Car car, int maxDistance) {
		if(car.isLongerThan(maxDistance)) {
			return car.getDistance();
		}

		return maxDistance;
	}
}
