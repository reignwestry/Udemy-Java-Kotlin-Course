import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("ArrayLists!");
        //NOTE ArrayLists === creates an empty list iwht an initial capacity of ten.

        //NOTE CREATE an ArrayList
        ArrayList animals = new ArrayList();
        animals.add(34);
        animals.add("Cow");
        animals.add("Parrot");
//        animals.add("Cheetah");

//        animals.remove(0);
        animals.add(0, "Dog");
//        animals.remove("Cow");

        //check if the arrayList contains
        if(animals.contains("Parrot")){
            animals.remove("Parrot");
        } else {
            System.out.println("Nope");
        }

        //Loop through ArrayList
        for(int i = 0; i < animals.size() ; i++){
            System.out.println("Animals: " + animals.get(i));
        }

        animals.remove("Cheetah");
        animals.add(34);
        animals.add("Cow");
        animals.add("Parrot");
        //Alternate: Smart for Loop
        for(Object animal: animals){
            System.out.println(animal);

        }


        System.out.println(animals.size());


    }
}