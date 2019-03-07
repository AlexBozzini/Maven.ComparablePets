package io.zipcoder.Pets;

public class Pet implements Comparable<Pet> {
    private String name;

    public Pet(){
        this.name = "Pet";
    }

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String speak(){
        return "pet sound";
    }

    public int compareTo(Pet o) {
        return 0;
    }
}
