package vending;

import fst.State;

public interface VendingState extends State {

    default VendingOutput getNext(Input1 input, State[] states){throw new UnsupportedOperationException();}
    default VendingOutput getNext(Input2 input2, State[] states){throw new UnsupportedOperationException();}
    default VendingOutput getNext(InputButton inputButton, State[] states){throw new UnsupportedOperationException();}
    default VendingOutput getNext(InputStock inputStock, State[] states){throw new UnsupportedOperationException();}
}
