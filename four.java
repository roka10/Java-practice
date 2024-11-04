import java.util.*;
public class four {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a fixed value");
        int n=sc.nextInt();
        try (Scanner a = new Scanner(System.in)) {
            System.out.println("enter the number");
            int num=a.nextInt();
            if (num>n) {
                System.out.println(num+"greater than"+n);
            }
            else if (num<n) {
                System.out.println(num+"less than"+n);
            }
            else if (num==n) {
                System.out.println(num+"is equal to"+n);
            }
        }
    }
}
