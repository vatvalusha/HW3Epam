package task13;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public class Adult extends People {
    public Adult(int age, String name) {
        super(age, name);
    }

    public Adult(){}

    public People createPeople() {
        int age = (int)(41+Math.random()*100 - 41);
        return new Adult(age,NamesSpace.randName());
    }

    @Override
    public String toString() {
        return "Adult [" +
                "name: " + getName() +
                " age: "+ getAge()+
                "]";
    }
}
