package com.pedroborgesalves.javadesignpatterns.builder.example1;

/**
 * <h1>Builder Pattern</h1>
 * <p>
 * The intent of the Builder Pattern is to separate the construction of a
 * complex object from its representation, so that the same construction process
 * can create different representations. This type of separation reduces the
 * object size.</p>
 * <p>
 * - The algorithm for creating a complex object should be independent of the
 * parts that make up the object and how they’re assembled.</p>
 * <p>
 * The construction process must allow different representations for the object
 * that’s constructed.</p>
 *
 */
public class BuilderDemo {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Lokesh", "Gupta")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Jack", "Reacher")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}
