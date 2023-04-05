package home_work_3;

public class Task_1 {
    public static void Merge(int[] result, int[] arr1, int[] arr2) {
        int arr1MinIndex = 0;
        int arr2MinIndex = 0;
        int resultMinIndex = 0;

        while (arr1MinIndex < arr1.length && arr2MinIndex < arr2.length) {
            if (arr1[arr1MinIndex] < arr2[arr2MinIndex]) {
                result[resultMinIndex] = arr1[arr1MinIndex];
                arr1MinIndex++;            
            }
            else {
                result[resultMinIndex] = arr2[arr2MinIndex];
                arr2MinIndex++;               
            }
            resultMinIndex++;
        }

        while (arr1MinIndex < arr1.length) {
            result[resultMinIndex] = arr1[arr1MinIndex];
                arr1MinIndex++; 
                resultMinIndex++; 
        }
        while (arr2MinIndex < arr2.length) {
            result[resultMinIndex] = arr2[arr2MinIndex];
                arr2MinIndex++; 
                resultMinIndex++; 
        }

        
    }
    public static void mergeSort(int[] arr) {
        if (arr.length == 1) return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < right.length + mid; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        Merge(arr, left, right);
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 3,6, 1};
        mergeSort(arr);
        
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
