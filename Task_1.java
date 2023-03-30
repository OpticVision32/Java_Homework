// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. 
// Используя данные из массива найдите их кубы.

// Sample Input:

// 8
// 11
// Sample Output:

// 512
// 1331
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        int[] array = new int[1000];

        for (int i = 1; i < array.length + 1; i++) {
            array[i - 1] = i * i * i;
        }
        System.out.println("Введите первое число: ");
        int num_1 = iScanner.nextInt();
        System.out.println("Введите второе число: ");
        int num_2 = iScanner.nextInt();
        iScanner.close();
        System.out.println(array[num_1 - 1]);
        System.out.println(array[num_2 - 1]);
    }
}
