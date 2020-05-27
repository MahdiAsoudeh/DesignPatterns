package com.mahdi20.behavioral.state;

// State 2
class FastState implements IState {

    public int MoveUp(Context context) {

        context.Counter += 5;
        return context.Counter;

    }

    public int MoveDown(Context context) {

        if (context.Counter < context.limit) {
            context.State = new NormalState();

            System.out.print("||");

        }
        context.Counter -= 5;
        return context.Counter;
    }

}