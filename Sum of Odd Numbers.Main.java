import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,i=0,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter maximum value of n");
        n=in.nextInt();
        System.out.println("Sum of Even Numbers");
        for(i = 1; i<=n ; i=i+2)
        {
            sum=sum+i;
        }
        System.out.println("Sum = " + sum);
    }
}