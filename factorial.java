import java.util.Scanner;
public class factorial {
    public static int calFact(int n)
        {
            if (n==0)
            {
                return 1;
            }
            else if (n<0)
            {
                return -1;
            }
            int fact=1;
            for(int i=n;i>0;i--)
            {
                fact=fact*i;
            }
            return fact;
        }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("enter the no. whose factorial you want");
            int n=sc.nextInt();
            int answer= calFact(n);
            System.out.println("factorial of "+n+" is "+answer);
        }
    }
}
