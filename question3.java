
public class question3
{
    public static void main(String[] args)
    {
        int i=0;
        int a=1;
        int sum=0;
        do
        {
            int b=a*a;
            sum=sum+b;
            ++a;
            ++i;
        }
        while(i<10);
        System.out.println("sum is "+sum);
    }
}