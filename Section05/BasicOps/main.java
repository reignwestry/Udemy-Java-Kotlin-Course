package BasicOps;

public class main{
    public static void main(String[] args){

        //??: Basic Operations

        //variables - little empty buckets

        String myName = "Reign";
        String lastName = "Dream";

        //Integers
        int myAge = 40;



        String message =  "Hello World - Java!!,  " + myName + " " + lastName;
        System.out.println(message);

//        int myNum = 24344365434534;// number is to large
//        System.out.println(myNum);

        //NOTE: BYTE - small integer type 0 to 127
        byte myByte = 123;
        System.out.println(myByte);

        //NOTE: SHORT - 2 times the size of a byte
        short myShort = 128;
        System.out.println("My Short is: " + myShort);

        //NOTE: FLOATS - are any decimal numbers
        float piNum = 3.14f;
        System.out.println("My float is: " + piNum);

        //NOTE: Double - bigger fraction
        double myDouble = 23.89;
        System.out.println("My float is: " + myDouble);

        //NOTE: Char - a single character (&, $, !, @ ...)
        //NOTE: only use single quotes
        char myChar = 'h';

        //NOTE: BOOLEANS - 1 or 0, true or false
        boolean myBool = true;
        System.out.println("my bool is " + myBool);


        //NOTE: Math Operations

        //NOTE: Addition = "+"
        //NOTE: Subtraction= "-"
        //NOTE: Mulitplication = "*"
        //NOTE: Division = "/"
        //NOTE: Remainder = "what remains.." 4 % 2 = 0 because nothing remains 4 % 3 = 1

        double firstNum = 34;
        double secondNum = 3;
        System.out.println("The sum is " + (firstNum + secondNum));
        System.out.println("The sum is " + (firstNum - secondNum));
        System.out.println("The sum is " + (firstNum * secondNum));
        System.out.println("The sum is " + (firstNum / secondNum));

        firstNum = 10;
        secondNum = 3;
        System.out.println("The sum is " + (firstNum % secondNum)); //1

        //NOTE: ===RELATIONAL OPERATORS===



        //NOTE: equals ==
        //NOTE: NOT equals !=
        //NOTE: GREATER than >
        //NOTE: LESS than >
        //NOTE: GREATER than OR equal <=
        //NOTE: LESS than OR equal >=


        //NOTE: IF ELSE statements (Decision Tree)
        double thirdNum = firstNum;

        if(firstNum == secondNum){
            System.out.println("first is equal to second"); //wont run because they are not equal
        } else if (firstNum == thirdNum ) {
            System.out.println("Numbers are equal");
        }

        //NOTE: Logical Operators and if statements

        /** NOTE: ==== Logical Operators ===
         *
         *          AND ( && ) == both side have to be true
         *          OR  ( || ) == either side has to be true
         *          NOT ( ! ) == has to be false
         *
         */
        boolean isOld = true;
        boolean isYoung = false;
        if(isOld && isYoung){ //incorrect is isOld and isYoung true
            System.out.println("Boolean is correct");
        }
        if(isOld || isYoung){ //correct -- is isOld or isYoung true
            System.out.println("Boolean is correct");
        }
        if(isOld && !isYoung){ //correct -- is isOld and isYoung(not false) true
            System.out.println("Boolean is correct");
        }

        //NOTE: FOR AND WHILE LOOPS

        /*
           NOTE: for Loop
         */


        for (int i = 0; i < 10; i++){
            System.out.println("Counting " + i);
        }

        //NOTE: while Loop
        int i = 0;
        while(i < 5) {
            System.out.println(" Counting...");
        }





    }
}