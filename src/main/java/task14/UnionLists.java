package task14;

import java.util.*;

/**
 * Created by Valerii Artemenko on 23.02.2017.
 */
public class UnionLists<T> implements Comparator<Number> {
    List<Integer> list;
    public List<T> unionLists(Collection<? extends T> list1, Collection<? extends T> list2) {
        List<T> newList = new ArrayList<T>(list1);
        if (list1 == null) newList = (List<T>) list2;
        if(list2 == null) newList = (List<T>) list1;
        if(list1 == null && list2 == null) return null;
        newList.addAll(list2);
        Collections.sort(newList, (Comparator<? super T>) new UnionLists<T>());
        return newList;
    }

    public List<Integer> generateRandomList() {
        list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int a = (int)(1 + Math.random()*100);
            list.add(a);
        }
        return list;
    }

    public int compare(Number o1, Number o2) {
        if (o1.intValue() > o2.intValue())
            return 1;
        else if (o1.intValue() < o2.intValue())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "UnionLists{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {
        UnionLists<Integer> union = new UnionLists<Integer>();

        List<Integer> list1 =  union.generateRandomList();
        List<Integer>  list2  = union.generateRandomList();
        System.out.println(union.unionLists(list1,list2));

    }
}
