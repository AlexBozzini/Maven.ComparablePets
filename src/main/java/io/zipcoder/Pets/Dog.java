package io.zipcoder.Pets;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog(){
        super.name = "Athos";
    }

    @Override
    public String speak(){
        return "woof";
    }
}
