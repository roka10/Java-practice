package DSA;
public class checkArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 6};
        int n = arr.length;
        boolean isSorted = true;

        for (int i = 1; i < n; i++) { // Start from index 1
            if (arr[i] < arr[i - 1]) { // Compare current element with the previous one
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
