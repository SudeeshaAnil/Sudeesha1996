//Program to find the Largest two numbers in a given array
import java.util.Scanner;
class Largest
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
                if(array[i]<array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Largest two numbers in the array is: ");
        for(int i=0;i<2;i++)
        {
            System.out.println(array[i]+"");
        }
    }
}