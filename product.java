import java.util.Scanner;

public class product {
    public static int calculate(int a,int b)
    {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in))
        {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            
            int result = calculate(a, b);
            System.out.println("Product: " + result);
        }
    }  
}
