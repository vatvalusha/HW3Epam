package task13;

import javax.activation.MailcapCommandMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public class CreateList<T extends People> implements Comparator<T>{
    T people;
    List<T> list = new ArrayList<T>();


    public  People createPeopleList(){
        int i = (int)(Math.random()*3);
        switch (i){
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

    public List<T> fullingList(){
        for(int i = 0; i<20; i++){
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

    public void sortList(){
        Collections.sort(list, new CreateList<T>());
    }

    public int compare(T o1, T o2) {
        if (o1.getAge() > o2.getAge())
            return 1;
        else if (o1.getAge() < o2.getAge())
            return -1;
        return 0;
    }
}
