package org.juliodev.designpatterns.structural.adapter.adapters;

import org.juliodev.designpatterns.structural.adapter.adaptee.Turkey;
import org.juliodev.designpatterns.structural.adapter.client.Duck;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
