package org.juliodev.designpatterns.behavioral.strategy;

import org.juliodev.designpatterns.behavioral.strategy.superclass.Duck;
import org.juliodev.designpatterns.behavioral.strategy.behaviors.fly.FlyNoWay;

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
