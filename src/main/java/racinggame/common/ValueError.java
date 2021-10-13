package racinggame.common;

public enum ValueError {
	INVALID_NUMBER_VALUE("유효하지 않은 숫자입니다."),
	INVALID_NAME_VALUE("이름은 공백과 길이가 제한됩니다.[길이: 5이하]"),
	DUPLICATE_CAR_NAME("자동차의 이름은 중복을 허용하지 않습니다.");

	private String errorType;

	ValueError(String errorType) {
		this.errorType = errorType;
	}

	public String getMessage() {
		return this.errorType;
	}
}
