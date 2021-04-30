//Program to concatenate two strings
import java.util.Scanner;
class Concatenate
{
    public static void main(String[]args)
    {
        String s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        s1=sc.nextLine();
        System.out.println("Enter the second string: ");
        s2=sc.nextLine();
        s3=s1+s2;
        System.out.println(s3);
    }
}