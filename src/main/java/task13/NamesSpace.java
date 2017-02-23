package task13;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public class NamesSpace {
    private static String[] name = {"Valera", "Alex", "Stas", "Oleg", "Anna", "Viktoriya", "Alexander", "Vladimir", "Alina", "Natasha",
            "Vitalik", "Sergey", "Dasha", "Sveta", "Angelina", "Roma", "Ayza", "Vlad", "Maksim", "Viktor", "Valentina",
            "Pasha", "Artur", "Oly", "Kristina"};

    public static String randName() {
        return name[(int) (Math.random() * 25)];
    }
}
