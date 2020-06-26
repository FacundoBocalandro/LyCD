package vending;

import fst.State;

public class S3 implements VendingState {
    @Override
    public VendingOutput getNext(Input1 input, State[] states) {
        return new VendingOutput("Press button for coffee", states[4], 0);
    }

    @Override
    public VendingOutput getNext(Input2 input2, State[] states) {
        return new VendingOutput("Press button for coffee | change: $1", states[4], 0);
    }
}
