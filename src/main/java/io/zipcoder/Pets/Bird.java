package io.zipcoder.Pets;

import io.zipcoder.Pets.Pet;

public class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }

    public Bird(){
        this("Disco");
    }

    @Override
    public String speak(){
        return "tweet";
    }
}
