package home_work_2;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк в книге: ");
        int line = sc.nextInt();
        String[] book = new String[line];
        String[] newBook = new String[line];
        for (int i = 0; i < book.length; i++) {
            System.out.println("Введите рецепт: ");
            book[i] = System.console().readLine();
        }
        System.out.println("Введите количество продуктов: ");
        int productsSize = sc.nextInt();
        String[] prod = new String[productsSize * 2];
        for (int i = 0; i < prod.length - 1; i+=2) {
            System.out.println("Введите продукты: ");
            prod[i] = System.console().readLine();
            prod[i + 1] = Capitalize(prod[i].split("-")[0]) + "-" + Capitalize(prod[i].split("-")[1]);
        }

        for (int i = 0; i < prod.length; i++) {
            System.out.println(prod[i]);
        }

        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < prod.length; j++) {
                String newStr = book[i].replaceAll(prod[j].split("-")[0], prod[j].split("-")[1]); 
                book[i] = newStr;                
            }
            newBook[i] = book[i];            
        }

        for (int i = 0; i < newBook.length; i++) {
            System.out.println(newBook[i]);
        }

        
    }

    public static String Capitalize(String stroka) {
        return stroka.substring(0,1).toUpperCase() + stroka.substring(1);
    }
}
