package io.zipcoder.PetTests;

import io.zipcoder.Pets.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTests {
    @Test
    public void nullaryConstructorTest(){
        // given
        Dog dog = new Dog();
        String expected = "Athos";
        // when
        String actual = dog.getName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        // given
        Dog dog = new Dog("Neeko");
        String expected = "Neeko";
        // when
        String actual = dog.name;
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        // given
        Dog dog = new Dog();
        String expected = "woof";
        // when
        String actual = dog.speak();
        // then
        Assert.assertEquals(expected, actual);
    }
}
