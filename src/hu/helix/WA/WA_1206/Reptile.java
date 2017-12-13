package hu.helix.WA.WA_1206;

/**
 * Created by java1 on 2017.12.13..
 */
public class Reptile extends Animal {

    public Reptile() {
        setLatinName("adf");
        setWeightInKg(12.6f);
        setSex(Sex.Female);
    }

    @Override
    public void move() {
        System.out.println("Reptile is moving");
    }

    @Override
    public String toString() {
        return "Latin name: " +getLatinName()+ " \t Weight: "+ getWeightInKg() + "\t Sex: "+getSex();
    }
}
