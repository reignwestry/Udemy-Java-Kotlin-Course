public class BasketBall  extends Ball {
    //Properties
    public boolean isNBA;
    public int capacity;

    //Behaviors
    public boolean isNBA(){
        System.out.println("true");
        return true;
    }

    //Override -- override a inheritted behavior
    public void bounce(){
        System.out.println("Basketball Bouncing");

    }
}
