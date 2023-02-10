import java.util.Scanner;
class twostrings
{
    static int l;
    static String twostring(String s1,String s2)
    {
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.substring(i,i+1)==s2.substring(j,j+1))
                {
                    l=l+1;
                }
            }
        }
        if(l>1)
        {
            return "Yes";
        }
        else{
            return "No";
        }

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the no of test casess"); 
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s1=sc.nextLine();
            String s2=sc1.nextLine();
            System.out.println(twostring(s1,s2));
        }       
    }
}