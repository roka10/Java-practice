import java.util.Scanner;

public class palindrome {
    static boolean isPalindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        if(isPalindrome(str))
        {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        sc.close();
    }
}
