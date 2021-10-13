package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class NameTest {
	@DisplayName("유효하지 않은 이름 검증")
	@ParameterizedTest
	@ValueSource(strings = {"", " ", "abide5", "@#!abc", "하늘하늘12", "테공 백"})
	void notValidName(String name) {
		assertThatIllegalArgumentException()
			.isThrownBy(() ->  new Name(name) )
			.withMessageContaining("이름은 공백과 길이");
	}
}
