package fst;

public interface State {
    default Output getNext(Input input, State[] states){throw new UnsupportedOperationException();}
}
