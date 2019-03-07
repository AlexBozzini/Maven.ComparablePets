package io.zipcoder.Pets;

import io.zipcoder.Pets.Pet;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat(){
        this("Nova");
    }

    @Override
    public String speak(){
        return "meow";
    }
}
