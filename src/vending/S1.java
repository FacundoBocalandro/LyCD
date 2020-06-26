package vending;

import fst.State;

public class S1 implements VendingState {
    @Override
    public VendingOutput getNext(Input1 input1, State[] states) {
        return new VendingOutput("2$ to go",states[2], 0);
    }

    @Override
    public VendingOutput getNext(Input2 input2, State[] states) {
        return new VendingOutput("1$ to go",states[3], 0);
    }
}
