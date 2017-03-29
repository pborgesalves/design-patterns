/*
 */
package com.pedroborgesalves.javaprinciples.singleresponsability;

/**
 *
 * @author pedroborgesalves
 */
public class GoodExample {

}

class UserSettingService {

    public void changeEmail(User user) {
        if (SecurityService.checkAccess(user)) {
            //Grant option to change
        }
    }
}

class SecurityService {

    public static boolean checkAccess(User user) {
        //check the access.
        return true;
    }
}
