package task13;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public class Mature extends People {
    public Mature(int age, String name) {
        super(age, name);
    }
    public Mature(){}

    public Mature createPeople() {
        int age = (int)(18 + Math.random()*40)-18;
        return new Mature(age,NamesSpace.randName());
    }

    @Override
    public String toString() {
        return "Mature [" +
                "name: " + getName() +
                " age: "+ getAge()+
                "]";
    }
}
