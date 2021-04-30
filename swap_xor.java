//program to swap the contents of two numbers using Bitwise XOR operation
import java.util.Scanner;
class swap{
    public static void main(String[]args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a=sc.nextInt();
        System.out.println("Enter the second number: ");
        b=sc.nextInt();
        System.out.println("Before swaping value of a= "+a);
        System.out.println("Before swaping value of b= "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swaping value of a= "+a);
        System.out.println("After swaping value of b= "+b);
    }
}