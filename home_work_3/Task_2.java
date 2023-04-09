package home_work_3;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) { 
    List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);
    for(int i = 0;i<list.size()-1;i++){
        int temp = list.get(i);
        for (int j = i + 1; j < list.size(); j++) {
            if (list.get(j) < temp)
                temp = list.get(j);
        }
        Collections.swap(list, list.indexOf(temp), i);
    }
    System.out.println(list);
    }
}

