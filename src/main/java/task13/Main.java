package task13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        CreateList<People> listPeople = new CreateList<People>();
        listPeople.fullingList();
        System.out.println(listPeople.getList());

        listPeople.sortList(listPeople.getList());
        System.out.println(listPeople.getList());


     }
}
