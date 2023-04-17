package home_work_6;

import java.util.*;
import java.util.Scanner;

public class Notebook {
    static int noteKey = 0;

    
    public HashMap<Integer, String> db_nb = new HashMap<>();

    
    public HashMap<Integer, Integer> db_ram = new HashMap<>();

    
    public HashMap<Integer, Integer> db_ssd = new HashMap<>();


    void addNotebook(String name, int ram, int ssd, String os, String color) {
        noteKey ++;
        db_nb.put(noteKey, name);
        db_ram.put(noteKey, ram);
        db_ssd.put(noteKey, ssd);
    }

    void showMenu() {
        
        System.out.println("Доступные критерии поиска:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объём ЖД");
        // System.out.println("3 - Операционная система");
        // System.out.println("4 - Цвет");
        
    }

    void showRamAvailable() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= db_ram.size(); i++)
            set.add(db_ram.get(i));        
        
        System.out.println("Доступные варианты ОЗУ:");
        for (int elem : set)
            System.out.print(elem+" ");
        System.out.println();
        
    }

    void showSsdAvailable() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= db_ssd.size(); i++)
            set.add(db_ssd.get(i));
        
        System.out.println("Доступные варианты SSD:");
        for (int elem : set)
            System.out.print(elem+" ");
        System.out.println();
        
    }

    void showQueryResult(String category, String value) {
        
        System.out.println("Подходящие ноутбуки:");
        boolean found = false;
        switch (category) {
            case "ram":
                int ram = Integer.parseInt(value);
                for (int i = 1; i <= db_ram.size(); i++) {
                    if (db_ram.get(i) == ram) {
                        found = true;
                        System.out.println("- "+db_nb.get(i));
                    }
                }
                break;
            case "ssd":
                int ssd = Integer.parseInt(value);
                for (int i = 1; i <= db_ssd.size(); i++) {
                    if (db_ssd.get(i) == ssd) {
                        found = true;
                        System.out.println("- "+db_nb.get(i));
                    }
                }
                break;
        }
        if (!found)
            System.out.println("Варианты не найдены :(");
        
    }

    

    
}

