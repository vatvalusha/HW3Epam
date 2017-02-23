package task13;

import java.util.List;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        CreateList<People> listPeople = new CreateList<People>();
        listPeople.fullingList();
        System.out.println(listPeople.getList());
        listPeople.sortList();
        System.out.println(listPeople.getList());
    }
}
