package org.juliodev.designpatterns.behavioral.strategy;

import org.juliodev.designpatterns.behavioral.strategy.superclass.Duck;
import org.juliodev.designpatterns.behavioral.strategy.behaviors.fly.FlyNoWay;
import org.juliodev.designpatterns.behavioral.strategy.behaviors.quack.Quack;

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
