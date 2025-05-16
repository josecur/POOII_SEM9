package Ducks;

import Comportamientos.FlyWithWings;
import Comportamientos.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        this.performFly();
        this.performQuack();
    }
}
