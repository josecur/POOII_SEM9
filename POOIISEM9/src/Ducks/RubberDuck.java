package Ducks;

import Comportamientos.FlyNoWay;
import Comportamientos.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        this.performFly();
        this.performQuack();
    }
}
