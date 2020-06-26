package trafficlights;

import fst.State;

public class EWGo implements TrafficState{
    @Override
    public TrafficOutput getNext(InputTimerElapsed input, State[] states) {
        return new TrafficOutput("Waiting for car...", states[1], 100000);
    }

    @Override
    public TrafficOutput getNext(InputCar input, State[] states) {
        return new TrafficOutput("Waiting for timer to finish...", states[2]);
    }
}
