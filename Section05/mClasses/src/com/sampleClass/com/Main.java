package com.sampleClass.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //NOTE: 26. INTRO to Classes and Objects
        // Classes are blueprints of objects aka Piano, lamp, glove, etc. but more abstract


        //NOTE: 1. Create the class (in a separate class file)
        //! Created the ball class file

        //NOTE: 2. Call a new instance of the  Class
        Ball myBall = new Ball();
        Ball secondBall = new Ball();

        //NOTE: 3. Assign values to the properties of the instance
        myBall.color = "blue";
        myBall.name = "Basketball";
//        myBall.capacity = 10; //NOTE: private property
//        myBall.bounceRate = 2;

        secondBall.name = "Soccer Ball";
        secondBall.color = "brown";
//        secondBall.bounceRate = 3;

        BasketBall basketBall = new Basketball();
        Baseball baseball = new Baseball();

        basketBall.color = "Blue";
        basketBall.name = "Basketball";
        basketBall.isNBA = "true";
        basketBall.capacity = 23;

        baseball.color = "Brown";
        baseball.name = "Baseball";




        System.out.println("Ball color: " + myBall.color);
        System.out.println("Ball name: " + myBall.name);
        System.out.println("Ball capacity: " + myBall.capacity);

    }
}