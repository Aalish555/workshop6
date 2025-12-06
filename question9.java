import java.util.Scanner;
public class question9
{
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number=input.nextInt();
    int rev=0;
    while(number!=0)
    {
        int r=number%10;
        rev=rev*10 + r;
        number=number/10;
    }
    System.out.print("reversed number is "+rev);
    }
}
