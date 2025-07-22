package DSA;

public class removeDuplicates {
    public static int removeDuplicatesFromArray(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0; // Edge case: empty array

        int i = 0; // Pointer for the unique element index
        for (int j = 1; j < n; j++) { // Start from index 1
            if (arr[j] != arr[i]) { // Found a new unique element
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // Length of unique elements
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3, 3};
        int newLength = removeDuplicatesFromArray(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
