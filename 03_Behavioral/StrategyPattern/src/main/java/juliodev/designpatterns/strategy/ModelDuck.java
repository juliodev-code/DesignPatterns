package juliodev.designpatterns.strategy;

import juliodev.designpatterns.strategy.behaviors.fly.FlyNoWay;
import juliodev.designpatterns.strategy.behaviors.quack.Quack;
import juliodev.designpatterns.strategy.superclass.Duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model Duck");
    }
}
