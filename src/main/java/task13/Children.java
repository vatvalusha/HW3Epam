package task13;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public class Children extends People {
    public Children(int age, String name) {
        super(age, name);
    }
     public Children(){}

    public People createPeople() {
        int age = (int)(Math.random()*11);
        return new Children(age,NamesSpace.randName());
    }

    @Override
    public String toString() {
        return "Children [" +
                "name: " + getName() +
                " age: "+ getAge()+
                "]";
    }
}
