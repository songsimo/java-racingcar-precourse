package racinggame.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import racinggame.common.Const;
import racinggame.common.ValueError;

public class Name {


	private String name;

	public Name(String name) {
		if(!isValid(name)) {
			throw new IllegalArgumentException(ValueError.INVALID_NAME_VALUE.getMessage());
		}
		this.name = name;
	}

	private boolean isValid(String name) {
		return isNotBlank(name) && isValidLength(name);
	}

	private boolean isNotBlank(String name) {
		Pattern pattern = Pattern.compile(Const.NAME_REGX);
		Matcher matcher = pattern.matcher(name);

		return !matcher.find();
	}

	private boolean isValidLength(String name) {
		int length = name.length();

		return length >= Const.MIN_NAME_LENGTH && length <= Const.MAX_NAME_LENGTH;
	}

	public String getName() {
		return name;
	}
}
