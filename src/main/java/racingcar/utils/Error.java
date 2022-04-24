package racingcar.utils;

public enum Error {
	INVALID_TEXT_NAME("[ERROR] 유효하지 문자(공백)가 포함되어 있습니다."),
	INVALID_NAME_LENGTH("[ERROR] 유효하지 문자(공백)가 포함되어 있습니다."),
	INVALID_NUMBER("[ERROR] 시도 횟수는 숫자여야 한다.")
	;

	public static final String COMMON_MESSAGE = "[ERROR]";

	private String message;

	Error(String message) {
		this.message = message;
	}

	public String getMessage() {
		return COMMON_MESSAGE + " " +message;
	}
}
