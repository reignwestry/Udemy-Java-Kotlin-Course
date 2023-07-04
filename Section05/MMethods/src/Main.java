//NOTE: 23. Intro to Methods and Parameters

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Note: calling the methods
        myName("Reign");

        int finalResult = addNums(4,5) + 10;
        System.out.println("Final Result: " + finalResult );
        anotherMethod();
        myAlias("maal", 35);

        System.out.println(fullName("George", "The Man"));
        System.out.println(showChar('d'));

    }

    //NOTE: Methods
    //NOTE: Method types: Public or Private
    public static void myName(String mName){ //String method
        System.out.println(mName);
    }

    public static int addNums(int a, int b){ // integer method
//        System.out.println(" Sum = " + (a + b));

        //Alternate Method
        int result;
        result = a + b;
        return result;
    }

    public static void anotherMethod(){ //void method == return nothing
        System.out.println("Another method");
    }

    private static void myAlias(String alias, int age){
        System.out.println("Alias: " + alias + " " + age);
    }

    //Return a String
    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    //Return a Character
    public static char showChar(char c){ //single characters MUST be in single quotes
        return c;
    }


}