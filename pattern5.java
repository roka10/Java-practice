public class pattern5 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++) //it will print the rows
        {
            for(int k=1;k<=4-i;k++) // it will print the spaces
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) // it will print the stars
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
