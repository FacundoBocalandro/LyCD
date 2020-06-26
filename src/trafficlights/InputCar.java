package trafficlights;

import fst.Output;
import fst.State;

public class InputCar implements TrafficInput{
    @Override
    public Output getNext(State prev, State[] states) {
        return ((TrafficState)prev).getNext(this, states);
    }
}
