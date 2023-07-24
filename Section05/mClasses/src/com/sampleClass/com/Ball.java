package com.sampleClass.com;

public class Ball { //blueprint with properties

    //NOTE: Access Modifiers are private and public
    //? public == anyone can access it
    //? private == only things inside the class can access it


    //Properties or Instance variables
    private String color;
    private String name;
    private int capacity;
    private int bounceRate;


    //NOTE: GETTERS AND SETTERS
    // (flexible way to get and set variables)
    //NOTE: 1) Right-click private variables and
    //NOTE: 2) hit "GENERATE", then "GETTERS AND SETTERS"
    //NOTE: 3) SELECT ALL THE VARIABLES, then click ok
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }


    //NOTE: CONSTRUCTORS
    public Ball(){ //every class MUST have a default (empty) constructor

    }
    public Ball(String mColor, String mName, int mCapacity, int mBounceRate) {
        //this == this color passing into the method
        this.color = mColor;
        this.name = mName;
        this.capacity = mCapacity;
        this.bounceRate = mBounceRate;
    }
    public Ball(String mColor, String mName){ //overloads the default constructor
        color = mColor;
        name = mName;
    }
    //NOTE: Overloading = is a constructor with the same name but different parameters
    public Ball(String mColor, String mName, int mCapacity){
        color = mColor;
        name = mName;
        capacity = mCapacity;
    };



    //NOTE: (Behaviors)
    //NOTE: PRIVATE METHODS
    //Only accessible by the class or function
    public void showColor(){
        System.out.println(color); //NOTE accesses the this.color
    }
    public void showName(){
        System.out.println(name);
    }
    public void showCapacity(){
        System.out.println(capacity);
    }



    //NOTE: Public Methods
//    public void Bounce(){
//        System.out.println("Bouncing...");
//    }
//    public void Deflate(){
//        System.out.println("Deflating...");
//    }
//    public void inflates(){
//        System.out.println("Inflating...");
//    }




}
