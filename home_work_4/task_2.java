package home_work_4;
import java.util.*;
public class task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        int length = d1.size();
        for (int i = 0; i < length; i++) {
            ll.add(d1.pollFirst() + d2.pollFirst());
        }
        System.out.println(ll);
    }
}
