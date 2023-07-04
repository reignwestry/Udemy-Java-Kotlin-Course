package com.sampleClass.com;

public class Basketball extends Ball {

    //Properties
    private boolean isNBA;
    private int capacity;

    //Behaviors
    public boolean isNBA(){
        if(isNBA == true){
            return true;
        } else {
            return false;
        }
    }

}
