package org.juliodev.designpatterns.behavioral.strategychallenge.behaviors.share;

public class TextMessageShare implements ShareBehavior{
    @Override
    public void share() {
        System.out.println("Sharing Photo by Message");
    }
}
