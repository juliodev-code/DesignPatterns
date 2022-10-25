package juliodev.designpatterns.strategy;

import juliodev.designpatterns.strategy.behaviors.fly.FlyWithWings;
import juliodev.designpatterns.strategy.behaviors.quack.Quack;
import juliodev.designpatterns.strategy.superclass.Duck;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
