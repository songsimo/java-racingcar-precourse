package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MileageTest {
	@DisplayName("엔진 상태에 따른 주행거리")
	@ParameterizedTest
	@CsvSource({
		"1,START,STOP,STOP",
		"0,STOP,STOP,STOP",
		"3,START,START,START",
		"2,START,STOP,START"
	})
	void add(final int expected, EngineStatus status1, EngineStatus status2, EngineStatus status3) {
		Mileage mileage = new Mileage(0);

		mileage.add(status1);
		mileage.add(status2);
		mileage.add(status3);

		assertThat(mileage.distance()).isEqualTo(expected);
	}
}
