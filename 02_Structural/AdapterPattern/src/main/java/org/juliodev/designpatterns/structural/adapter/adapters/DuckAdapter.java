package org.juliodev.designpatterns.structural.adapter.adapters;

import org.juliodev.designpatterns.structural.adapter.adaptee.Turkey;
import org.juliodev.designpatterns.structural.adapter.client.Duck;
import java.util.Random;

public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck){
        this.duck = duck;
        this.random = new Random();
    }

    @Override
    public void gobble() {
        this.duck.quack();
    }

    @Override
    public void fly() {
        if(random.nextInt(5) == 0){
            duck.fly();
        }
    }
}
