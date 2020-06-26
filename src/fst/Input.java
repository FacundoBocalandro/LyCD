package fst;


public interface Input {
    Output getNext(State prev, State[] states);
}
