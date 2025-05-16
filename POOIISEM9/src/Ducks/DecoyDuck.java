package Ducks;

import Comportamientos.FlyBehavior;
import Comportamientos.FlyNoWay;
import Comportamientos.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        this.performFly();
        this.performQuack();
    }
}
