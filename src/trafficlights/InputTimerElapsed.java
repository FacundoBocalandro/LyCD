package trafficlights;

import fst.Output;
import fst.State;

public class InputTimerElapsed implements TrafficInput{
    @Override
    public Output getNext(State prev, State[] states) {
        return ((TrafficState)prev).getNext(this, states);
    }
}
