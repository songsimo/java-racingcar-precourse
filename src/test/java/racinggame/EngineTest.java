package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import racinggame.domain.Engine;

public class EngineTest {
	@Test
	@DisplayName("엔진 시동 1, 중지 0")
	void start() {
		assertThat(new Engine(9).getStep()).isEqualTo(1);
		assertThat(new Engine(3).getStep()).isEqualTo(0);
		assertThat(new Engine(4).getStep()).isEqualTo(1);
		assertThat(new Engine(0).getStep()).isEqualTo(0);
	}
}
