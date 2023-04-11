package home_work_4;

import java.util.*;

public class task_3 {
    public static void main(String[] args) {
        String str = "[]{()[{}[]]}";
        String open = "({[";
        String close = ")}]";
        boolean flag = true;
        Deque<Character> dl = new ArrayDeque<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (str.length() % 2 != 0) {
                flag = false;
                break;
            }
            if (open.indexOf(ch) >= 0) {
                dl.offerFirst(ch);
            } else {
                int index = close.indexOf(ch);
                if (dl.size() == 0 || dl.pollFirst() != open.charAt(index)) {
                    flag = false;
                    break;
                }
            }
            if (!flag)
                break;
        }
        System.out.println(flag);
    }
}
