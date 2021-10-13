package racinggame;

import nextstep.utils.Randoms;

public class RandomNumber implements NumberGenerator{
	private static final int MAX_NUMBER = 9;
	private static final int MIN_NUMBER = 0;

	@Override
	public int generateNumber() {
		return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
	}
}
