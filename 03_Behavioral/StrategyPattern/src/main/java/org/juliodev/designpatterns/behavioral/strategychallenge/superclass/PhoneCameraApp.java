package org.juliodev.designpatterns.behavioral.strategychallenge.superclass;

import org.juliodev.designpatterns.behavioral.strategychallenge.behaviors.share.ShareBehavior;

public abstract class PhoneCameraApp {
    public ShareBehavior shareBehavior;

    public void take(){
        System.out.println("Taking Photo");
    }
    public void save(){
        System.out.println("Saving Photo");
    }
    public abstract void edit();

    public void setShareBehavior(ShareBehavior shareBehavior) {
        this.shareBehavior = shareBehavior;
    }
}
