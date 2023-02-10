import java.util.Scanner;
class primenumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the number");
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=1;i<n;i++)
        {
            if(n%1==0)
            {
                a[i-1]=i;
                count=count+1;
            }
        else{
            a[i]=0;
            count=count;
        }
        }
        if(count==2)
        {
            System.out.println("1");
        }
        else
        {
            for(int i=1;i<n;i++)
            {
                if(a[i]!=0)
                {
                    System.out.println(a[i]);
                    break;
                }
            }
            System.out.println("given number is not prime");
        }
    }
}