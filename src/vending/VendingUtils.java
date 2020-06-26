package vending;

import fst.Delta;
import fst.State;

public class VendingUtils {

    private VendingState[] states;
    private VendingDelta delta;

    public VendingUtils() {
        states = createStates();
        delta = createDelta(this);
    }

    private VendingState[] createStates() {
        return new VendingState[]{new S0(), new S1(), new S2(), new S3(), new S4()};
    }

    private VendingDelta createDelta(VendingUtils vendingUtils) {
        return new VendingDelta(vendingUtils);
    }

    public VendingState[] getStates() {
        return states;
    }

    public VendingDelta getDelta() {
        return delta;
    }
}
