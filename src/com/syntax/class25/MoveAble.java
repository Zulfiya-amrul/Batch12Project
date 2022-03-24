package com.syntax.class25;

public interface MoveAble {
    void move ();
}
interface driverAble {
    void driver ();
}
interface car extends driverAble, MoveAble{

}
class BMW implements car {

    @Override
    public void move() {

    }

    @Override
    public void driver() {

    }
}