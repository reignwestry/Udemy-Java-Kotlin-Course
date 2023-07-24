public class Main {
    public static void main(String[] args) {

        //NOTE: Intro to Inheritance
        // to inherit the properties from something else

        Ball myBall = new Ball();

        BasketBall basketBall = new BasketBall();
        Baseball baseball = new Baseball();

        basketBall.color = "Blue";
        basketBall.name = "Basketball";
        basketBall.isNBA = true;
        basketBall.isNBA();

        System.out.println(basketBall.name);
        System.out.println(baseball.name);

        Baseball fastBall = new Baseball();
        fastBall.name = "fastBall"; //Property extended from Ball
        fastBall.texture = "hard";
        fastBall.weight = "heavy";
        fastBall.league = "MLB";
        fastBall.ballSpeed = "both";
        fastBall.ballSize = "small";

        System.out.println(fastBall.name);
        fastBall.whatTexture();
        fastBall.bounce();
        fastBall.whatLeague();
        fastBall.ballThrown();

        //Java Class Library
        StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Life");
            stringBuilder.append(" is great");
            stringBuilder.append(" when you are happy!");

            stringBuilder.delete(1,2); //deletes the character "i" from life

            System.out.println("The string contains " + stringBuilder.capacity() + " places for all the characters" );
            System.out.println(stringBuilder);

    }
}