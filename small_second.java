//Program to find the second largest and smallest element in a given array
import java.util.Scanner;
class SecondSmall
{
    public static void main(String[]args)
    {
        int n,temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want in an array: ");
        n=sc.nextInt();
        int[] array=new int[10];
        System.out.println("Enter the elements in an array: ");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Second Largest= "+array[n-2]);
        System.out.println("Smallest= "+array[0]);
    }
}