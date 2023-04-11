package home_work_5;
import java.util.Scanner;
import java.util.*;
import java.util.HashMap;

public class task_1 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    Map<String, ArrayList<String>> ml = new HashMap<>();
    System.out.println("Введите имя: ");
    String name = sc.nextLine();
    System.out.println("Введите количество номеров: ");  
    int countNumbers = sc.nextInt();
    String number = "";
    ArrayList<String> phoneNumbers = new ArrayList<String>();

    for (int i = 0; i < countNumbers; i++) {
        System.out.println("Введите номер: ");
        number = sc.next();
        phoneNumbers.add(number);
    }
    ml.put(name, phoneNumbers);
    
    System.out.println(ml);
    
    }
    
}
