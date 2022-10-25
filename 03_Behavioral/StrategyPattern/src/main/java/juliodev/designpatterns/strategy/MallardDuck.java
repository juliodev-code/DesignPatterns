package juliodev.designpatterns.strategy;

import juliodev.designpatterns.strategy.behaviors.fly.FlyWithWings;
import juliodev.designpatterns.strategy.behaviors.quack.Quack;
import juliodev.designpatterns.strategy.superclass.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
       this.quackBehavior = new Quack();
       this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
