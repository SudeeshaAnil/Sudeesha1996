//Program to multiply given number using bitwise operators
import java.util.Scanner;
class Bitwise
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        //<< left shift operator
        int mul=n<<1;
        System.out.println("Product= "+mul);
    } 
}