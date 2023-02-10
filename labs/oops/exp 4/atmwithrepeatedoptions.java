/*
 points for exam:
    1)Scanner package: java.util.Scanner;
 */

import java.util.Scanner;

class LessBalanceException extends Exception
{
    LessBalanceException(String s)
    {
        super(s);
    }
}
class Account
{
    Scanner sc=new Scanner(System.in);
    double minbal=1000d;
    void deposit()
    {
        System.out.println("enter the amount to be deposited");
        double dep=sc.nextDouble();
        minbal=minbal+dep;
    }
    void withdraw() throws LessBalanceException
    {
        System.out.println("enter the amount to be withdrawn");
        double wd=sc.nextDouble();
        if((minbal-wd)<1000)
        {
            
            throw new LessBalanceException("Withdrawn amount ("+wd+") is invalid");
            
        }
    }
}
public class atmwithrepeatedoptions
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Account first=new Account();
        Account second=new Account();
        int ll=1;
        while(ll>0)
        {
        System.out.println("enter the account number 1:first account 2:second account 3:exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                int lll=1;
                while(lll>0)
                {
                System.out.println("enter what u want to do");
                System.out.println("1:deposit 2:withdraw 3:balance 4:exit");
                int ch1=sc.nextInt();
                switch(ch1)
                {
                    case 1:
                    {
                        first.deposit();
                        break;
                    }
                    case 2:
                    {
                        try
                    {
                        first.withdraw();
                        break;
                    }
                    catch(LessBalanceException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    }
                    break;
                    case 3:
                    {
                        System.out.println(first.minbal);
                        break;
                    }
                    case 4:
                    {
                        lll=0;
                        break;
                    }
                    default:
                    {
                         System.out.println("entered invalid option");
                         break;
                    }
                }
            }
                break;
            }
            case 2:
            {
                int lll2=1;
                while(lll2>0)
                {
                System.out.println("enter what u want to do");
                System.out.println("1:deposit 2:withdraw 3:balance 4:exit");
                int ch1=sc.nextInt();
                switch(ch1)
                {
                    case 1:
                    {
                        second.deposit();
                        break;
                    }
                    case 2:
                    {

                        try
                    {
                        second.withdraw();
                        break;
                    }
                    catch(LessBalanceException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    }
                    case 3:
                    {
                        System.out.println(first.minbal);
                    }
                    case 4:
                    {
                        lll2=0;
                        break;
                    }
                    default:
                    {
                        System.out.println("entered invalid option");
                    }
                }
            }
                break;
            }
            case 3:
            {
                ll=0;
                break;
            }
            default:
            {
                System.out.println("entered invalid account number or invalid option");
            }
        
        }
    }
    }  
}
