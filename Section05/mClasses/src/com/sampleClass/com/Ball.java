package com.sampleClass.com;

public class Ball { //blueprint with properties

    //NOTE: Access Modifiers
    //? public == anyone can access it
    //? private == only things inside the class can access it

    //Properties or Instance variables
    public String color;
    private int capacity;
    public String name;
    private int bounceRate;


    //NOTE: Behaviors
    public void Bounce(){
        System.out.println("Bouncing...");
    }
    public void Deflate(){
        System.out.println("Deflating...");
    }
    public void inflates(){
        System.out.println("Inflating...");
    }




}
