package hu.helix.WA.WA_1206;

/**
 * Created by java1 on 2017.12.13..
 */
public class Bird extends Animal {
    public void move(){
        System.out.println("Bird is flying");
    }

    public Bird () {
        setLatinName("adf");
        setWeightInKg(6.6f);
        setSex(Sex.Female);
    }

    @Override
    public String toString() {
        return "Latin name: " +getLatinName()+ " \t Weight: "+ getWeightInKg() + "\t Sex: "+getSex();
    }
}
