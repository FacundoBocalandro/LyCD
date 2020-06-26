package fst;

public abstract class FST {
    State[] states;
    State q0;
    Delta delta;
    State actual;

    public FST(State[] states, State q0, Delta delta) {
        this.states = states;
        this.q0 = q0;
        this.delta = delta;
        this.actual = q0;
    }

    public State getActual() {
        return actual;
    }

    public void setActual(State actual) {
        this.actual = actual;
    }
}
