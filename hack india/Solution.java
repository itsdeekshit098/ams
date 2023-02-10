import java.util.Scanner;
class Solution
{
    static int l;
    static String s1;
    static String s2;
    public static String twoStrings(String s1,String s2)
    {
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.substring(i,i+1).equals(s2.substring(j,j+1)))
                {
                    l=l+1;
                }
            }
        }
        if(l>=1)
        {
            return "Yes";
        }
        else{
            return "No";
        }

    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the no of test casess"); 
        int n=sc.nextInt();
        try{
        for(int i=0;i<n;i++)
        {
            s1=sc.next();
            s2=sc1.nextLine();
            System.out.println(twoStrings(s1, s2));

        }
    } 
    catch (Exception ex) {
        throw new RuntimeException(ex);
    }   
    }
}
