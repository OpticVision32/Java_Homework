package home_work_2;

public class task_1 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String newStr = "";
        int count = 0;
        char[] charJewels = jewels.toCharArray();
        char[] charStones = stones.toCharArray();
        for (int i = 0; i < charJewels.length; i++) {
            for (int j = 0; j < charStones.length; j++) {
                if (charJewels[i] == charStones[j]) {
                    count++;
                }
            }
            newStr += charJewels[i] + Integer.toString(count);
            count = 0;
        }
        System.out.println(newStr);
    }
}
