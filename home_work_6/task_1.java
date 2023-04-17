package home_work_6;
import java.util.Scanner;
import java.util.HashSet;

public class task_1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Notebook notebooks = new Notebook();

        notebooks.addNotebook("HP ", 8, 512, "Windows 7", "black");
        notebooks.addNotebook("Lenovo", 16, 2048, "Windows 10", "gray");
        notebooks.addNotebook("MSI", 8, 1024, "Windows 10", "black");
        notebooks.addNotebook("Acer", 16, 1024, "Windows 11", "black");

        notebooks.showMenu();
        System.out.print("Введите цифру, соответствующую  критерию: ");
        int res = sc.nextInt();
        sc.nextLine();
        
        String query;

        switch(res) {
            case 1:
                notebooks.showRamAvailable();
                System.out.print("Введите значение ОЗУ: ");
                query = sc.nextLine();
                notebooks.showQueryResult("ram", query);
                break;
            case 2:
                notebooks.showSsdAvailable();
                System.out.print("Введите значение SSD: ");
                query = sc.nextLine();
                notebooks.showQueryResult("ssd", query);
                break;
        }
    }
}
