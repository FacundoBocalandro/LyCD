package vending;

import fst.State;

public class S4 implements VendingState {
    @Override
    public VendingOutput getNext(InputButton inputButton, State[] states) {
        return new VendingOutput("Expending coffee... Thanks Edward!" ,states[0], 7);
    }
}
