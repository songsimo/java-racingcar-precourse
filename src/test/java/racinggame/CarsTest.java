package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import racinggame.common.ValueError;
import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.PlayResult;

public class CarsTest {
	@Test
	@DisplayName("자동차 주행 테스트")
	void drive() {
		Cars cars = new Cars(Arrays.asList(new Car("java", 0), new Car("song", 0), new Car("pobi", 0)));

		PlayResult result = cars.drive(new RandomNumber());
	}

	@Test
	@DisplayName("자동차 이름 중복")
	void duplicatedName() {
		assertThatIllegalArgumentException()
			.isThrownBy(() -> new Cars(Arrays.asList(new Car("java"), new Car("java"), new Car("pobi"))))
			.isInstanceOf(IllegalArgumentException.class)
			.withMessageContaining(ValueError.DUPLICATE_CAR_NAME.getMessage());
	}

	@Test
	@DisplayName("우승자 정보 얻기")
	void getWinners() {
		Cars cars = new Cars(Arrays.asList(new Car("java", 4), new Car("song", 2), new Car("pobi", 4)));

		PlayResult result = cars.getWinners();
	}

}
