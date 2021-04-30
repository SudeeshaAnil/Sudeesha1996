//program to count the number of bits set to one.
import java.util.Scanner;
class count
{
    public static void main(String[]args)
    {
        int n,count=0,a,len;
        String x="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        n=sc.nextInt();
        while(n>0)
        {
            a=n%2;
            x=a+x;
            n=n/2;      
        }
        len=x.length();
        for(int i=0;i<len;i++)
        {
            if(x.charAt(i)=='1')
            {
                count++;
            }

        }
        System.out.println("No.of 1's counts are"+count);
    }
}