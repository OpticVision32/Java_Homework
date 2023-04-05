// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”


package home_work_2;
import java.util.HashMap;
public class task_2 {
    public static void main(String[] args) {
        String s = "cba";       
        int[] index = {3,2,1};
        String result = "";
        
        HashMap<Integer,Character> dictionary = new HashMap<Integer,Character>();
        
        for (int i = 0; i < index.length; i++) {
            dictionary.put(index[i], s.charAt(i));
        }
        for (int i = 1; i < index.length + 1; i++) {
            result += dictionary.get(i);           
        }
        System.out.println(result);
    }
}
