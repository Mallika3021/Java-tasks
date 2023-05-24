
package programs;
import java.util.*;
public class task2
{
    public static void main(String args[])
    {
        Random r=new Random();
        int r1=r.nextInt(100);
        int score=100,chance=10;
        Scanner input=new Scanner(System.in);
        for(int i=0;i<chance;i++)
        {
            System.out.println("Please enter your number ");
            int num=input.nextInt();
            if(r1==num)
            {
                System.out.println("Wooah! Your number is Matched with Generated number ");
                System.out.print("Your guessing score is "+score+"%");
                break;
            }
            else if(num<r1)
            {
                score=score-10;
                System.out.println("Oops! Your number is less than Generated Number! TRY AGAIN");
            }
            else if(num>r1)
            {
                score=score-10;
                System.out.println("Oops! Your number is More than Generated Number! TRY AGAIN");
            }
        }
    }
}