import Comportamientos.FlyNoWay;
import Comportamientos.FlyWithJetpack;
import Ducks.DecoyDuck;
import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.display();

        Duck decoy = new DecoyDuck();
        decoy.display();

        Duck ruber = new RubberDuck();
        ruber.display();
        ruber.setFlyBehavior(new FlyWithJetpack());
        ruber.display();
    }
}