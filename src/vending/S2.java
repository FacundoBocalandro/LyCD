package vending;

import fst.State;

public class S2 implements VendingState {
    @Override
    public VendingOutput getNext(Input1 input, State[] states) {
        return new VendingOutput("1$ to go", states[3], 0);
    }

    @Override
    public VendingOutput getNext(Input2 input2, State[] states) {
        return new VendingOutput("Press button for coffee", states[4], 0);
    }
}
