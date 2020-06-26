package trafficlights;

import fst.State;

public class EWStop implements TrafficState{
    @Override
    public TrafficOutput getNext(InputTimerElapsed input, State[] states) {
        return new TrafficOutput("EW: Red, NS: Green",states[4], 15);
    }
}
