package org.juliodev.designpatterns.behavioral.strategychallenge.behaviors.share;

public class SocialMediaShare implements ShareBehavior {
    @Override
    public void share() {
        System.out.println("Sharing photo by social media");
    }
}
