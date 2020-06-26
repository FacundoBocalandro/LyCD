package trafficlights;

import fst.State;

public class NSStop implements TrafficState{
    @Override
    public TrafficOutput getNext(InputTimerElapsed input, State[] states) {
        return new TrafficOutput("NS: Red, EW: Green",states[0], 15);
    }
}
