package trafficlights;

import fst.FST;
import fst.Output;

public class TrafficLights extends FST {

    private final static TrafficUtils trafficUtils = new TrafficUtils();

    public TrafficLights() {
        super(trafficUtils.getStates(), trafficUtils.getStates()[0], trafficUtils.getDelta());
    }

    public Timer getTimer() {
        return trafficUtils.getTimer();
    }

    public Output newEvent(TrafficInput input) {
        Output output = trafficUtils.getDelta().nextState(getActual(), input);
        setActual(output.getState());
        int waitTime = output.getWaitTime();
        if (waitTime != -1) getTimer().setTime(waitTime);
        return output;
    }
}
