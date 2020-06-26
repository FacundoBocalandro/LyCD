package trafficlights;

import fst.State;

public class NSGoR implements TrafficState{
    @Override
    public TrafficOutput getNext(InputCar input, State[] states) {
        return new TrafficOutput("NS: Yellow, wait...", states[7], 3);
    }
}
