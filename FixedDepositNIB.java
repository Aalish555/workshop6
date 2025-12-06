import java.util.Scanner;
public class FixedDepositNIB
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double processing_fee=0.005;
        while(true)
        {
                System.out.println("Enter deposit (minimum: Rs1000) :");
                double deposit=input.nextDouble();
                if(deposit<1000)
                {
                    System.out.println("Deposit must be greater than 1000");
                    continue;
                }
                
                System.out.println("Enter duration in years (1-5 years):");
                double duration=input.nextDouble();
                if(duration<1 || duration>5)
                {
                    System.out.println("duration must be within 1 to 5 years");
                    continue;
                }
                
                System.out.println("Enter interest rate % (8-12%):");
                double interest=input.nextDouble();
                if(interest>12 || interest <8)
                {
                    System.out.println("interest must be within 8 to 12 percentage");
                    continue;
                }
                double months=duration*12;
                double monthly_interest=(interest/12)/100;
                double compoundinterest=deposit*Math.pow(1+monthly_interest,months);
                double fee=compoundinterest*processing_fee;
                double final_value=compoundinterest-fee;
                System.out.println("Amount before fee: Rs"+compoundinterest);
                System.out.println("Fee: Rs"+fee); 
                System.out.println("Final amount: Rs"+final_value);
            
            System.out.println("Enter 0 to exit the program and 1 to continue with another FD: ");
            int decision=input.nextInt();
            if (decision==0){break;}
            
        }
    }
}