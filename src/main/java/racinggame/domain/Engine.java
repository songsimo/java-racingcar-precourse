package racinggame.domain;

import racinggame.common.Const;
import racinggame.common.EngineStatus;
import racinggame.common.ValueError;

public class Engine {
	private int acceleration;

	public Engine(int acceleration) {
		if(acceleration < Const.MIN_NUMBER || acceleration > Const.MAX_NUMBER) {
			throw new IllegalArgumentException(ValueError.INVALID_NUMBER_VALUE.getMessage());
		}

		this.acceleration = acceleration;
	}

	public int getStep() {
		if(acceleration >= Const.ACCEL_GAUGE) {
			return EngineStatus.START.getStep();
		}
		return EngineStatus.STOP.getStep();
	}
}
