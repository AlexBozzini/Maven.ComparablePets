package io.zipcoder.PetTests;

import io.zipcoder.Pets.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTests {
    @Test
    public void nullaryConstructorTest(){
        // given
        Cat cat = new Cat();
        String expected = "Nova";
        // when
        String actual = cat.getName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        // given
        Cat cat = new Cat("Toast");
        String expected = "Toast";
        // when
        String actual = cat.name;
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        // given
        Cat cat = new Cat();
        String expected = "meow";
        // when
        String actual = cat.speak();
        // then
        Assert.assertEquals(expected, actual);
    }
}
