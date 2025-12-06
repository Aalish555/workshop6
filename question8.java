import java.util.Scanner;
public class question8
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        for(int i=1;i<=10;i++)
        {
            int output=number*i;
            System.out.println(number+" X "+i+" = "+output);
        }
    }
}