package org.juliodev.designpatterns.behavioral.strategychallenge.behaviors.share;

public class EmailShare implements ShareBehavior{
    @Override
    public void share() {
        System.out.println("Sharing photo by email");
    }
}
