package vending;

import fst.Output;
import fst.State;

public class Input2 implements VendingInput {

    @Override
    public Output getNext(State prev, State[] states) {
        return ((VendingState)prev).getNext(this, states);
    }
}
