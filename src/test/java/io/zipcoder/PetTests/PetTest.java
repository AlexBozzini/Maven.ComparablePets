package io.zipcoder.PetTests;

import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void nullaryConstructorTest(){
        // given
        Pet pet = new Pet();
        String expected = "Pet";
        // when
        String actual = pet.getName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        // given
        Pet pet = new Pet("name");
        String expected = "name";
        // when
        String actual = pet.name;
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        // given
        Pet pet = new Pet("name");
        String expected = "name";
        // when
        String actual = pet.getName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        // given
        Pet pet = new Pet();
        String expected = "Pet";
        // when
        String actual = pet.name;
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        // given
        Pet pet = new Pet();
        String expected = "pet sound";
        // when
        String actual = pet.speak();
        // then
        Assert.assertEquals(expected, actual);
    }
}
