import java.util.*;
public class third {
    public static void main(String [] args)
    {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check odd or even: ");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is an even number.");
        }
        else if (num%2!=0) {
            System.out.println(num+"is an odd number");
        }
    }

}
