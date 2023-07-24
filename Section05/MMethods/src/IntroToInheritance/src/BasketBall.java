package IntroToInheritance.src;

import com.sampleClass.com.Ball;

public class BasketBall  extends Ball {
    //Properties
    public boolean isNBA;
    public int capacity;

    //Behaviors
    public boolean isNBA(){
        return true;
    }

    //Override -- override a inheritted behavior
    public void bounce(){
      System.out.println("Basketball Bouncing");

    }
}
