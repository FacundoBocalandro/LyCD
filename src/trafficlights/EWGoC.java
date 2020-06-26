package trafficlights;

import fst.State;

public class EWGoC implements TrafficState{
    @Override
    public TrafficOutput getNext(InputTimerElapsed input, State[] states) {
        return new TrafficOutput("EW: Yellow, wait...", states[3], 3);
    }

    @Override
    public TrafficOutput getNext(InputCar input, State[] states) {
        return new TrafficOutput("Waiting for timer to finish...", states[2]);
    }
}
