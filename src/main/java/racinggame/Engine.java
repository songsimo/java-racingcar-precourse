package racinggame;

public class Engine {
	public static final int MAX_NUMBER  = 9;
	public static final int MIN_NUMBER  = 0;
	public static final int ACCEL_GAUGE = 4;

	private int acceleration;

	public Engine(int acceleration) {
		if(acceleration < MIN_NUMBER || acceleration > MAX_NUMBER) {
			throw new IllegalArgumentException("엔진의 숫자는 0부터 9의 값이여야 합니다.");
		}

		this.acceleration = acceleration;
	}

	public EngineStatus getStatus() {
		if(acceleration >= ACCEL_GAUGE) {
			return EngineStatus.START;
		}
		return EngineStatus.STOP;
	}
}
