package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

import racinggame.common.ValueError;
import racinggame.domain.Name;

public class NameTest {
	@DisplayName("유효하지 않은 이름 검증")
	@ParameterizedTest
	@ValueSource(strings = {"", " ", "abide5", "@#!abc", "하늘하늘12", "테공 백"})
	void notValidName(String name) {
		assertThatIllegalArgumentException()
			.isThrownBy(() ->  new Name(name) )
			.withMessageContaining(ValueError.INVALID_NAME_VALUE.getMessage());
	}
}
