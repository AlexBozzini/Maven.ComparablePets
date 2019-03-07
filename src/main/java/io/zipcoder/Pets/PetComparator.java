package io.zipcoder.Pets;

import java.util.Comparator;

public class PetComparator<T extends Pet> implements Comparator<T> {

    public int compare(T pet1, T pet2) {
        return pet1.getClass().getName().compareTo(pet2.getClass().getName()) * 10 + pet1.getName().compareTo(pet2.getName());
    }
}
