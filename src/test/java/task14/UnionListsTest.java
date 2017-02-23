package task14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by vatva on 23.02.2017.
 */
public class UnionListsTest {
    UnionLists<Integer> lists;
    List<Integer> list1;
    List<Integer> list2;

    @Before
    public void init(){
        lists = new UnionLists<Integer>();
        list1 = new ArrayList<Integer>();
        list2 = new ArrayList<Integer>();
    }

    @After
    public void clear(){
        lists = null;
        list1 = null;
        list2 = null;
    }

    @Test
    public void unionLists() throws Exception {
        list1.add(1);
        list1.add(5);
        list1.add(43);
        list1.add(423);
        list2.add(6);
        list2.add(4);
        list2.add(78);
        list2.add(100);
        Integer array[] = {1,4,5,6,43,78,100,423};
        List<Integer> expected = Arrays.asList(array);
        assertEquals(expected,lists.unionLists(list1,list2));
    }

    @Test
    public void unionResultNullObjectFirstTest(){
        list1.add(1);
        assertEquals(list1,lists.unionLists(list1,list2));
    }
    @Test
    public void unionResultNullObjectSecondTest(){
        list2.add(1);
        assertEquals(list2,lists.unionLists(list1,list2));
    }

    @Test
    public void unionResultNull(){
        List<Integer> zeroList = new ArrayList<Integer>();
        assertEquals(zeroList,lists.unionLists(list1,list2));
    }

}