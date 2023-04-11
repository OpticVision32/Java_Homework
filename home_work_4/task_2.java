package home_work_4;
import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        int length = d1.size();
        String num1 = "";
        String num2 = "";
        int summ = 0;
        for (int i = 0; i < length; i++) {
            num1 += Integer.toString(d1.pollLast());
            num2 += Integer.toString(d2.pollLast());
        }   
        summ = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        while (summ > 0) {
            ll.add(summ % 10);
            summ /= 10;
        }
        System.out.println(ll);
    }
}
