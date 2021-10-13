package racinggame.view;

import java.util.List;

import racinggame.domain.Car;
import racinggame.domain.PlayResult;

public class OutputView {
	private static final String ONE_STEP = "-";

	public static void printResultMessage() {
		System.out.println("실행 결과");
	}

	public static void printProgress(PlayResult result) {
		List<Car> cars = result.getResult();

		System.out.println("");
		for(Car car: cars) {
			System.out.println(car.getName() + " : " + getProgressBar(car));
		}
	}

	public static void printWinners(PlayResult result) {
		List<Car> cars = result.getResult();
		String winners = "";

		for(Car car: cars) {
			winners = addWinner(car, winners);
		}

		System.out.println("");
		System.out.println("최종 우승자는 " + winners + " 입니다.");
	}

	private static String getProgressBar(Car car) {
		int mileage = car.getMileage();
		StringBuilder builder = new StringBuilder();

		for(int i = 0; i < mileage; i += 1) {
			builder.append(ONE_STEP);
		}

		return builder.toString();
	}

	private static String addWinner(Car car, String winners) {
		if(winners.length() > 0) {
			winners += ",";
		}

		winners += car.getName();

		return winners;
	}
}
