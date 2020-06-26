package trafficlights;

import fst.Output;
import fst.State;

public class TrafficOutput implements Output {
    private String print;
    private State newState;
    private int waitTime;

    public TrafficOutput(String print, State newState, int waitTime) {
        this.print = print;
        this.newState = newState;
        this.waitTime = waitTime;
    }

    public TrafficOutput(String print, State newState){
        this.print = print;
        this.newState = newState;
        this.waitTime = -1;
    }

    @Override
    public String print() {
        return print;
    }

    @Override
    public State getState() {
        return newState;
    }

    @Override
    public int getWaitTime() {
        return waitTime;
    }
}
