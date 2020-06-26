package trafficlights;

import fst.State;

public class EWGoR implements TrafficState{
    @Override
    public TrafficOutput getNext(InputCar input, State[] states) {
        return new TrafficOutput("EW: Yellow, wait...", states[3], 3);
    }
}
