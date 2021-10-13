package racinggame;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {
	public static final String NAME_REGX = "\\s";
	public static final int MIN_NAME_LENGTH = 1;
	public static final int MAX_NAME_LENGTH = 5;

	private String name;

	public Name(String name) {
		if(!isValid(name)) {
			throw new IllegalArgumentException("이름은 공백과 길이가 제한됩니다.[길이: 5이하]");
		}
		this.name = name;
	}

	private boolean isValid(String name) {
		return isNotBlank(name) && isValidLength(name);
	}

	private boolean isNotBlank(String name) {
		Pattern pattern = Pattern.compile(NAME_REGX);
		Matcher matcher = pattern.matcher(name);

		return !matcher.find();
	}

	private boolean isValidLength(String name) {
		int length = name.length();

		return length >= MIN_NAME_LENGTH && length <= MAX_NAME_LENGTH;
	}

	public String getName() {
		return name;
	}
}
