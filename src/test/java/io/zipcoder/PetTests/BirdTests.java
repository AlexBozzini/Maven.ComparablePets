package io.zipcoder.PetTests;

import io.zipcoder.Pets.Bird;
import org.junit.Assert;
import org.junit.Test;

public class BirdTests {
    @Test
    public void nullaryConstructorTest(){
        // given
        Bird bird = new Bird();
        String expected = "Disco";
        // when
        String actual = bird.getName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        // given
        Bird bird = new Bird("Bowie");
        String expected = "Bowie";
        // when
        String actual = bird.getName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        // given
        Bird bird = new Bird();
        String expected = "tweet";
        // when
        String actual = bird.speak();
        // then
        Assert.assertEquals(expected, actual);
    }
}
