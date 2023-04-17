package home_work_5;


import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("Elena", "Elena", "Elena", "Sergey", "Ilya", "Ivan", "Igor","Igor","Igor","Sergey","Sergey"));
        String tempStr = "";
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            if (tempStr == al.get(i)) {
                    
                continue;
            }
            else {
                tempStr = al.get(i);
            }
            for (int j = 0; j < al.size(); j++) {
                if (al.get(j) == tempStr) {
                    count++;
                } 
            }
            if (count > 1) {
                System.out.println(al.get(i));
                System.out.println(count);
            }
            
            count = 0;
        }


    }
}

