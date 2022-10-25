package org.juliodev.designpatterns.behavioral.strategy;

import org.juliodev.designpatterns.behavioral.strategy.superclass.Duck;
import org.juliodev.designpatterns.behavioral.strategy.behaviors.fly.FlyWithWings;
import org.juliodev.designpatterns.behavioral.strategy.behaviors.quack.Quack;

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
