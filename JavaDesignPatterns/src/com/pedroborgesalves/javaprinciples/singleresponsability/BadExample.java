/*
 */
package com.pedroborgesalves.javaprinciples.singleresponsability;

/**
 *
 * @author pedroborgesalves
 */
public class BadExample {

    public void changeEmail(User user) {
        if (checkAccess(user)) {
            //Grant option to change
        }
    }

    public boolean checkAccess(User user) {
        //Verify if the user is valid.
        return true;
    }
}
