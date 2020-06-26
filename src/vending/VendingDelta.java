package vending;

import fst.Delta;
import fst.Input;
import fst.Output;
import fst.State;

public class VendingDelta extends Delta {
    VendingUtils utils;
    State[] states;

    public VendingDelta(VendingUtils utils) {
        this.utils = utils;
        states = utils.getStates();
    }

    Output nextState(State prev, Input input){
        return input.getNext(prev, states);
    }

}
