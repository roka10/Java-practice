package DSA;

public class practice {
    public static void main(String[] args) {
        int arr[] = {1,3,6,2,7,34,15};
        int l = arr[0];
        for(int i= 0;i<arr.length;i++)
        {
            if (arr[i] > l)
            {
                l = arr[i];
                
            }
           
        }
        System.out.println("Largest element is: " + l);

    }
}
