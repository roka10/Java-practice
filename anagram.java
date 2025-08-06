import java.util.Scanner;
public class anagram {

    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int count[] = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String1");
            String str1 = sc.nextLine();
            System.out.println("Enter the String2");
            String str2 = sc.nextLine();

            if (isAnagram(str1, str2)) {
                System.out.println("The two strings are anagrams of each other.");
            } else {
                System.out.println("The two strings are not anagrams of each other.");
            }
        }
    }
}
