package vending;

import fst.State;

public class S0 implements VendingState {
    @Override
    public VendingOutput getNext(InputStock inputStock, State[] states) {
        return new VendingOutput("Insert $3 for coffee", states [1], 0);
    }
}
