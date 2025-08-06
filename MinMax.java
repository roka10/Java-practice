public class MinMax {
    
    public static void main(String[] args)
    {
            int arr[]={1,3,5,23,7,9,12};
            int min=arr[0];
            int max=arr[0];
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]<min)
                {
                    min=arr[i];
                }
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            System.out.println("Minimum element is: "+min);
            System.out.println("Maximum element is: "+max);
    }
}
