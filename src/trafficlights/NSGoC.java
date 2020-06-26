package trafficlights;

import fst.State;

public class NSGoC implements TrafficState {
    @Override
    public TrafficOutput getNext(InputTimerElapsed input, State[] states) {
        return new TrafficOutput("NS: Yellow, wait...", states[7], 3);
    }

    @Override
    public TrafficOutput getNext(InputCar input, State[] states) {
        return new TrafficOutput("Waiting for timer to finish...", states[6]);
    }
}
