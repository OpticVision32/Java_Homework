
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        int num_1 = getInt();
        int num_2 = getInt();
        char operation = getOperation();
        int result = calc(num_1, num_2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num;
        if (iScanner.hasNextInt()) {
            num = iScanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            iScanner.next();
            num = getInt();
            
        }
        
        return num;
    }

    public static char getOperation() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите операцию:");
        char operation;
        if (iScanner.hasNext()) {
            operation = iScanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            iScanner.next();
            operation = getOperation();
        }
        
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
    
}
