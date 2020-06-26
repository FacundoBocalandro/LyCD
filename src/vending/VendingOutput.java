package vending;

import fst.Output;
import fst.State;

public class VendingOutput implements Output {
    private String print;
    private State newState;
    private int waitTime;

    public VendingOutput(String print, State newState, int waitTime) {
        this.print = print;
        this.newState = newState;
        this.waitTime = waitTime;
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
