package task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public class CreateList<T extends People> implements Comparator<T> {
    T people;
    List<T> list = new ArrayList<T>();

    public CreateList() {
    }

    public People createPeopleList() {
        int i = (int) (Math.random() * 3);
        switch (i) {
            case 0:
                people = (T) new Children().createPeople();
                break;
            case 1:
                people = (T) new Mature().createPeople();
                break;
            case 2:
                people = (T) new Adult().createPeople();
                break;
        }
        return people;
    }

    public List<T> fullingList() {
        for (int i = 0; i < 20; i++) {
            list.add((T) createPeopleList());
        }
        return list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "CreateList{" +
                "list=" + list +
                '}';
    }

    /**
     *
     * @param list our list people

     */
    public void sortList(List<T> list) {
        if (list == null || list.isEmpty())
            return;

        int length = list.size();
        int first = 0;
        int last = list.size() - 1;
        T bearing = list.get(first + (first + last) / 2);

        do {
            while (compare(list.get(first), bearing) < 0) first++;
            while (compare(bearing, list.get(last)) < 0) last--;

            if (first <= last) {
                T tmp = list.get(first);
                list.set(first, list.get(last));
                list.set(last, tmp);
                first++;
                last--;
            }
        } while (first <= last);
       sortList(list.subList(0, last + 1));
       sortList(list.subList(first, length));
    }


    public int compare(T o1, T o2) {
        return o1.getAge() < o2.getAge() ? -1 : o1.getAge() > o2.getAge() ? 1 : 0;
    }
}
