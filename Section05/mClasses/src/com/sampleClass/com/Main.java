package com.sampleClass.com;

public class Main {
    public static void main(String[] args) {
        //NOTE: 1) Create a constructor to access private properties
        Ball ball = new Ball(); //uses the default constructor
//        Ball ball = new Ball("blue", "justBall", 12, 45);

        Ball myBall = new Ball("Black", "AnotherBall");



        //NOTE: Accessing from private access modifier
            ball.setName("Hello");
            ball.setName("NewName");
            ball.setName("Red");
            ball.setBounceRate(435);
            ball.setCapacity(3);




            System.out.println(ball.getName() + ", " + ball.getColor() + ", " + ball.getBounceRate());
            System.out.println(ball.getName());
            System.out.println(ball.getBounceRate());


    }

}