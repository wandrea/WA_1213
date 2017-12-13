package hu.helix.WA.WA_1206;

/**
 * Created by java1 on 2017.12.13..
 */
public class Mammal extends Animal {

    public Mammal() {
        setLatinName("adfas");
        setWeightInKg(32.6f);
        setSex(Sex.Male);
    }

    @Override
    public void move() {
        System.out.println("Mammal is running");
    }


    @Override
    public String toString() {
        return "Latin name: " +getLatinName()+ " \t Weight: "+ getWeightInKg() + "\t Sex: "+getSex();
    }
}
