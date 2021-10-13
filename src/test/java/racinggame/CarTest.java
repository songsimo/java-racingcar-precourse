package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import racinggame.domain.Car;

public class CarTest {

	@DisplayName("엔진 상태에 따른 주행거리")
	@ParameterizedTest
	@CsvSource({
		"1,4,0,2",
		"0,0,3,2",
		"3,8,4,6",
		"2,5,3,4"
	})
	void drive(final int expected, int engine1, int engine2, int engine3) {
		Car car = new Car("pobi");

		car.drive(engine1);
		car.drive(engine2);
		car.drive(engine3);

		assertEquals(car.getMileage(), expected);
	}
}
