package juliodev.designpatterns.strategy;

import juliodev.designpatterns.strategy.behaviors.fly.FlyNoWay;
import juliodev.designpatterns.strategy.superclass.Duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = () -> System.out.println("Squeak");
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
