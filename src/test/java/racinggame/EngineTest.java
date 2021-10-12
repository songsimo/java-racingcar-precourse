package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EngineTest {
	@Test
	@DisplayName("엔진 상태값")
	void start() {
		assertThat(new Engine(9).getStatus()).isEqualTo(EngineStatus.START);
		assertThat(new Engine(3).getStatus()).isEqualTo(EngineStatus.STOP);
		assertThat(new Engine(4).getStatus()).isEqualTo(EngineStatus.START);
		assertThat(new Engine(0).getStatus()).isEqualTo(EngineStatus.STOP);
	}
}
