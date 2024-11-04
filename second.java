import java.util.*;
public class second {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your age: ");  // prompt the user to enter their age
    int age=sc.nextInt();
    if(age>=18)
    {
        System.out.println("You are eligible to vote.");
    }
    else
    {
        System.out.println("You are not eligible to vote.");
    }
}
}
