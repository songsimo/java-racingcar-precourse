package racinggame.controller;

import java.util.ArrayList;
import java.util.List;

import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.PlayResult;
import racinggame.RandomNumber;
import racinggame.utils.Validator;
import racinggame.view.InputView;
import racinggame.view.OutputView;

public class RacingGame {

	private Cars cars;
	private int count;
	private boolean isValidNames;
	private boolean isValidNumber;

	public void play() {
		PlayResult result;

		do {
			isValidNames = getCars(InputView.printCarNames());
		} while (!isValidNames);

		do {
			isValidNumber = getNumber(InputView.printRoundCount());
		} while (!isValidNumber);

		result = playRacing();
		OutputView.printProgress(result);

		result = getWinners();
		OutputView.printWinners(result);
	}

	private boolean getCars(String input) {
		try {
			String[] names = input.split(",");
			cars = new Cars(createCars(names));

			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}

		return false;
	}

	private List<Car> createCars(String[] names) {
		List<Car> cars = new ArrayList<>();

		for(String name: names) {
			cars.add(new Car(name));
		}

		return cars;
	}

	private boolean getNumber(String input) {
		try {
			Validator.validNumber(input);
			count = Integer.parseInt(input);

			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}

		return false;
	}

	private PlayResult playRacing() {
		return cars.drive(new RandomNumber());
	}

	private PlayResult getWinners() {
		return cars.getWinners();
	}
}
