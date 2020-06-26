package vending;

import fst.FST;
import fst.Output;


public class VendingMachine extends FST {

    private static final VendingUtils vendingUtils = new VendingUtils();
    public VendingMachine(){
        super(vendingUtils.getStates(), vendingUtils.getStates()[0], vendingUtils.getDelta());
    }

    public Output newEvent(VendingInput input) throws UnsupportedOperationException{
        Output output = vendingUtils.getDelta().nextState(getActual(), input);
        setActual(output.getState());
        return output;
    }
}
