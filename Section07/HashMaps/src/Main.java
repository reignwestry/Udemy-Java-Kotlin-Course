package src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        //NOTE HASHMAPS == lists for objects with keys and values
        //NOTE Can ONLY deal with OBJECTS
        //Hashmaps (key ==> value)

        HashMap <Integer, String> newUsers = new HashMap<>();
        newUsers.put(23, "Sandra");

        HashMap users = new HashMap();
        users.put("Sandra", 23);
        users.put("Paul", 31);
        users.put("George", 74);


        System.out.println(users.entrySet()); //displays list

        //Iterates through the list
        Iterator myIterator = users.entrySet().iterator();
        while (myIterator.hasNext()){
            Map.Entry pair = (Map.Entry) myIterator.next();
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
        }


    }
}