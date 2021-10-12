package racinggame;

public enum EngineStatus {
	START, STOP;

	public boolean isStart() {
		return this == START;
	}
}
