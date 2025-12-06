import java.util.Scanner;
public class question7
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double output=0;
        char decision='y';
        while(decision=='y')
        {
            System.out.println("enter first number: ");
            int num1=input.nextInt();
            System.out.println("enter second number: ");
            int num2=input.nextInt();
            System.out.println("Choose operation as +,-,*,/");
            char operator=input.next().charAt(0);
            switch(operator)
            {
                case '+':
                output=num1+num2;
                break;
                case '-':
                output=num1-num2;
                break;
                case '*':
                output=num1*num2;
                break;
                case '/':
                output=num1/num2;
                break;
                default:
                System.out.printf("You have entered wrong operator");
                return;
            }
            System.out.println("The output is "+output);
            System.out.println("do you want to perform operations for other numbers? (y/n)");
            decision=input.next().charAt(0);
    }
    System.out.println("Thank you");
}
}