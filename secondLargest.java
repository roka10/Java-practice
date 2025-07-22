package DSA;

public class secondLargest {
    public static void main(String[] args){
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for (int i= 0;i<n;i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest element is: " + secondLargest);
    }
}