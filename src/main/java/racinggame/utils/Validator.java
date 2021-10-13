package racinggame.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import racinggame.common.Const;
import racinggame.common.ValueError;

public class Validator {
	public static void validNumber(String input) {
		Pattern pattern = Pattern.compile(Const.NUMBER_REG_EX);
		Matcher matcher = pattern.matcher(input);

		if(!matcher.find()) {
			throw new IllegalArgumentException(ValueError.INVALID_NUMBER_VALUE.getMessage());
		}
	}
}
