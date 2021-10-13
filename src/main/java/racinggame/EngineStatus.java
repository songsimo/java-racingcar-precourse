package racinggame;

public enum EngineStatus {
	START(1),
	STOP(0);

	final private int value;

	EngineStatus(int value) {
		this.value = value;
	}

	public int getStep() {
		return value;
	}
}
