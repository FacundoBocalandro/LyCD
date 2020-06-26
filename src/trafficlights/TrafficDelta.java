package trafficlights;

import fst.Delta;
import fst.Input;
import fst.Output;
import fst.State;

public class TrafficDelta extends Delta {
    TrafficUtils utils;
    State[] states;

    public TrafficDelta(TrafficUtils trafficUtils) {
        this.utils = trafficUtils;
        this.states = trafficUtils.getStates();
    }

    Output nextState(State prev, Input input){
        return input.getNext(prev, states);
    }
}
