import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class JavaCollectionFramework {
    public static void main(String[] args) {
        // List or Collection -> interface

        // ArrayList -> concrete class

        // ArrayList<Integer> list = new ArrayList<Integer>();

        // // add
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // System.out.println(list);

        // // remove
        // list.remove(0);
        // System.out.println(list);

        // // Add All
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(91);
        // list2.add(10);

        // list.addAll(list2);

        // System.out.println(list);

        // list.removeAll(list2);

        // System.out.println(list);

        // System.out.println(list.size());

        // System.out.println("Printing List 2 :- " + list2);
        // list2.clear();
        // System.out.println(list2.size());

        // // i want to traverse list using iterator
        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        // System.out.println("Element : " + iterator.next());
        // }

        // ArrayList<Integer> list3 = new ArrayList<>();

        // list3.add(11);
        // list3.add(12);
        // list3.add(14);

        // System.out.println(list3.get(2));

        // list3.set(0, 100);
        // System.out.println(list3);

        // // toArray

        // Object[] arr = list3.toArray();
        // for (Object object : arr) {
        // System.out.println(object);
        // }

        // // contains
        // System.out.println(list3.contains(10000));

        // // Sorting
        // ArrayList<Integer> list4 = new ArrayList<>();
        // list4.add(60);
        // list4.add(12);
        // list4.add(10);
        // System.out.println("Printing Entire List: " + list4);

        // Collections.sort(list4);
        // System.out.println(list4);
        // Collections.reverse(list4);
        // System.out.println(list4);

        // ArrayList<Integer> newlList = (ArrayList<Integer>) list.clone();
        // System.out.println(newlList);

        // ArrayList<Integer> marks = new ArrayList<>();
        // marks.ensureCapacity(100);

        // System.out.println(newlList.isEmpty());
        // System.out.println(marks.isEmpty());

        // System.out.println(newlList.indexOf(30));

        // Linked List

        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(34);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(156);
        list.add(34);
        list.add(23);
        System.out.println(list);

        System.out.println(list.lastIndexOf(1));

        // Queue :- AddFirst and addLast

        System.out.println("Printing Original :- " + list);

        list.remove(3);
        list.remove(3);
        list.remove(3);
        System.out.println("Print :- " + list);

        list.addFirst(101);
        list.addLast(1);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        // System.out.println(list.getLast());
        // System.out.println(list.getFirst());

        // System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
        list.offer(12);
        System.out.println(list);

        Vector<Integer> vl = new Vector<>();
        vl.add(0);
        vl.add(2);
        System.out.println(vl);

        // Stack
        Stack<Integer> st = new Stack<>();
        st.add(12);
        st.push(9);
        System.out.println(st.get(0));
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.search(12));
        System.out.println(st.empty());
    }
}
