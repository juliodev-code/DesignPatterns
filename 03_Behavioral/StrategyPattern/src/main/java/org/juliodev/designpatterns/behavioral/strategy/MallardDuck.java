package org.juliodev.designpatterns.behavioral.strategy;

import org.juliodev.designpatterns.behavioral.strategy.behaviors.quack.Quack;
import org.juliodev.designpatterns.behavioral.strategy.superclass.Duck;
import org.juliodev.designpatterns.behavioral.strategy.behaviors.fly.FlyWithWings;

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
