// 0-1 triangle
public class pattern9 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum =i+j;
                if(sum%2==0) //even
                {
                System.out.print("1 ");    
                }
                else // odd
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
