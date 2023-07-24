public class Main {

    //NOTE: INTRO TO Arrays
    //NOTE: A container of buckets

    //NOTE: all arrays start with a zero index
        //arrays have length
    public static void main(String[] args) {

        System.out.println("INTRO TO ARRAYS!");

        //NOTE: CREATE AN ARRAY
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        String[] myStringArray = {"Hello", "Hi", "What"};

        System.out.println(myArray[0]);
        System.out.println(myArray.length); //shows the array length

        System.out.println(myStringArray[1]);

        //Loop through the array
        for(int i = 0; i < myArray.length; i++){
            System.out.println("item #: " + myArray[i]);
        }

        int[] newArray = new int[5];//NOTE 5 == CAN ONLY HAVE A PERMANENT set LENGTH (NUMBER OF ELEMENT SLOTS)
        String[] newStringArray = new String[5];

        //NOTE UPDATE ELEMENTS OF ARRAY
        newArray[0] =3;
        newArray[1] = 4;
        newArray[2] = 6;
        newArray[3] = 1;
        newArray[4] = 12;
        //NOTE can not add more than 5 because its predetermined

        newStringArray[0] = "Marcos";
        newStringArray[1] = "James";
        newStringArray[2] = "Jason";
        newStringArray[3] = "Laura";
        newStringArray[4] = "Bonni";

        //Loop through the array
        for(int i = 0; i < newStringArray.length; i++){
            System.out.println("String item #: " + newStringArray[i]);
        }


    }
}