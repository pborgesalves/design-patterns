package com.pedroborgesalves.javadesignpatterns.observer;

/**
 * <h1>Observer Pattern</h1>
 *
 * <p>
 * - When an abstraction has two aspects, one dependent on the other.
 * Encapsulating these aspects in separate objects lets you vary and reuse them
 * independently.</p>
 * <p>
 * - When a change to one object requires changing others, and you don’t know
 * how many objects need to be changed.</p>
 * <p>
 * - When an object should be able to notify other objects without making
 * assumptions about who these objects are. In other words, you don’t want these
 * objects tightly coupled.</p>
 *
 */
public class ObserverDemo {

    public static void main(String[] args) {
        CommentaryObjectObservable obj = new CommentaryObjectObservable("Soccer Match[2014AUG24]");
        SMSUsersObserver observer = new SMSUsersObserver(obj, "Adam Warner [New York]");
        SMSUsersObserver observer2 = new SMSUsersObserver(obj, "Tim Ronney [London]");
        observer.subscribe();
        observer2.subscribe();
        obj.setDesc("Welcome to live Soccer match");
        obj.setDesc("Current score 0-0");
        observer.unSubscribe();
        obj.setDesc("It’s a goal!!");
        obj.setDesc("Current score 1-0");
    }
}
