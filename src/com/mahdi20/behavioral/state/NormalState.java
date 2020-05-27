package com.mahdi20.behavioral.state;

// State 1
class NormalState implements IState {
    public int MoveUp(Context context) {

        context.Counter += 2;
        return context.Counter;

    }

    public int MoveDown(Context context) {

        if (context.Counter < context.limit) {
            context.State = new FastState();
            System.out.print("|| ");

        }

        context.Counter -= 2;
        return context.Counter;

    }
}