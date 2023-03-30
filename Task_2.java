// Вводится число n, затем n чисел целых, по одному на каждой строке.
//  Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.

// Sample Input:

// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:

// 2
// 4
// 6
// 10
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Сколько чисел будем вводить? ");
        int size = iScanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число: ");
            array[i] = iScanner.nextInt();
        }

        System.out.println("На какое число будем умножать?" );
        int multy = iScanner.nextInt();
        iScanner.close();
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * multy);
        }
    }
}
