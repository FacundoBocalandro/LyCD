package trafficlights;

import fst.State;

public interface TrafficState extends State {
    default TrafficOutput getNext(InputCar input, State[] states){throw new UnsupportedOperationException();}
    default TrafficOutput getNext(InputTimerElapsed input, State[] states){throw new UnsupportedOperationException();}
}
