package task13;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public abstract class People {
    private int age;
    private String name;

    public People(){}

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


   abstract public People createPeople();
}