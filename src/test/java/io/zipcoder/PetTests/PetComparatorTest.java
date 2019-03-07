package io.zipcoder.PetTests;

import io.zipcoder.Pets.*;
import org.junit.Assert;
import org.junit.Test;

public class PetComparatorTest {
    @Test
    public void test1(){
        // given
        PetComparator comparator = new PetComparator();
        Pet pet1 = new Dog("Spike");
        Pet pet2 = new Bird("Hazel");
        // when
        Integer comparisonValue = comparator.compare(pet1, pet2);
        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test2(){
        // given
        PetComparator comparator = new PetComparator();
        Pet pet1 = new Cat("Nova");
        Pet pet2 = new Cat("Ronnie");
        // when
        Integer comparisonValue = comparator.compare(pet1, pet2);
        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test3(){
        // given
        PetComparator comparator = new PetComparator();
        Pet pet1 = new Bird("Blue");
        Pet pet2 = new Bird("Max");
        // when
        Integer comparisonValue = comparator.compare(pet1, pet2);
        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test4(){
        // given
        PetComparator comparator = new PetComparator();
        Pet pet1 = new Bird("Disco");
        Pet pet2 = new Cat("Toast");
        // when
        Integer comparisonValue = comparator.compare(pet1, pet2);
        // then
        Assert.assertTrue(comparisonValue < 0);
    }
}
