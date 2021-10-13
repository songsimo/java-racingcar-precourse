package racinggame.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static final String NUMBER_REG_EX = "^[0-9]*$";

	public static void validNumber(String input) {
		Pattern pattern = Pattern.compile(NUMBER_REG_EX);
		Matcher matcher = pattern.matcher(input);

		if(!matcher.find()) {
			throw new IllegalArgumentException("횟수 입력은 숫자만 가능합니다.");
		}
	}
}
