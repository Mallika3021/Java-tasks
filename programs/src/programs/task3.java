package programs;
import java.util.*;
public class task3
{
    public static void main(String args[])
    {
        int withdraw, deposit, balance = 55000;
        Scanner input = new Scanner(System.in);
        String Id = "ABCD", pin = "2449";

        System.out.print("Enter your ATM pin: ");
        String in=input.nextLine();

        if(in.equals(pin))
        {
            while(true)
            {
                System.out.println("Welcome To The ATM");

                System.out.println("1.For Check Balance");
                System.out.println("2.For Withdraw");
                System.out.println("3.For Deposit");
                System.out.println("4.For Transfer");
                System.out.println("5.Exit");
                System.out.println("Choose the operation you want to perform:");

                int choice = input.nextInt();
                switch(choice)
                {
                    case 1:
                        //displaying the total balance of the user
                        System.out.println("Balance: "+balance);
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("Enter money to be withdrawn:");
                        withdraw = input.nextInt();
                        if(balance >= withdraw)
                        {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                        }
                        else
                            System.out.println("you have insufficient balance");//if the entered money is more than the account balance
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Enter your money to be deposited:");
                        deposit = input.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("Account Based Transfer");
                        System.out.println("Enter the Amount:");
                        int amount = input.nextInt();

                        if(amount > balance)
                            System.out.println("Transaction Failed");
                        else{
                            System.out.println("The amount transfer successfully");
                            balance = balance - amount;
                        }
                        System.out.println("");
                        break;

                    case 5:
                        //exit from the menu
                        System.out.println("Thank You");
                        System.out.println("Have a nice day!!");
                        System.exit(0);
                }//sc.close
            }
        }//pin
        else
            System.out.println("Invalid PIN");
    }
}
