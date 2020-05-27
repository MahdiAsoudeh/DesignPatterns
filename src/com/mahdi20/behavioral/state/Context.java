package com.mahdi20.behavioral.state;

// Context
class Context {

    public final int limit = 10;
    public IState State;

    public int getLimit() {
        return limit;
    }

    public IState getState() {
        return State;
    }

    public void setState(IState state) {
        State = state;
    }

    public int getCounter() {
        return Counter;
    }

    public void setCounter(int counter) {
        Counter = counter;
    }

    public int Counter = limit;

    public int Request(int n) {
        if (n == 2)
            return State.MoveUp(this);
        else
            return State.MoveDown(this);
    }
}
