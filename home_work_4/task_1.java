package home_work_4;
import java.util.*;
public class task_1 {
    public static void main(String[] args) {
        Deque<Integer> dl = new ArrayDeque<>(Arrays.asList(1,2,3,2,1));
        int[] dl1 = new int[dl.size() / 2];
        int[] dl2 = new int[dl.size() / 2];
        while (dl.size() > 1) {
            for (int i = 0; i < dl1.length; i++) {
                dl1[i] = dl.pollFirst();
                dl2[i]= dl.pollLast();
            }
        }
        System.out.println(Arrays.equals(dl1, dl2));
    }
}
