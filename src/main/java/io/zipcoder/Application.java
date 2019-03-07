package io.zipcoder;


import io.zipcoder.Pets.Bird;
import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;

import java.util.*;

public class Application {
    public static IOConsole ioconsole = new IOConsole();

    public static void main(String[] args) {
        Integer numberOfPets = ioconsole.getIntegerInput("How many pets do you have?");
        Map<String, String> pets = new HashMap<String, String>();
        for (int i = 0; i < numberOfPets; i++){
            String petType = ioconsole.getStringInput("What kind of pet is it?");
            petType = petType.toLowerCase();
            if (petType.equals("dog")){
                String petsName = ioconsole.getStringInput("What is its name?");
                Pet dog = new Dog(petsName);
                pets.put(petsName, dog.speak());
            } else if (petType.equals("cat")){
                String petsName = ioconsole.getStringInput("What is its name?");
                Pet cat = new Cat(petsName);
                pets.put(petsName, cat.speak());
            } else if (petType.equals("bird")){
                String petsName = ioconsole.getStringInput("What is its name?");
                Pet bird = new Bird(petsName);
                pets.put(petType, bird.speak());
            } else {
                ioconsole.print("Wrong input type");
                i = i - 1;
            }
        }
        Map<String, String> reversedMap = new TreeMap<String, String>(pets);
        for (Map.Entry entry : reversedMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
