import java.util.Scanner;
class Student
{
    String usn;
    String name;
    String branch;
    String phno;

    void assign(String a,String b,String c,String d)
    {
        usn=a;
        name=b;
        branch=c;
        phno=d;
    }

    void print()
    {
        System.out.println(usn+" "+name+" "+branch+" "+phno);
    }
    public static void main(String args[])
    {
        //String s[]=new String[100];
        //Student s[]=new Student[100];//creating array of type student or obj of stuent which is of array type
        String s[]=new String[100];
        Student obj =new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of students");
        int n=sc.nextInt();
        for(int h=0;h<n;h++)
        {
           System.out.println("enter the usn,name,branch,phno");
           String a =sc.next();
           String b =sc.next();
           String c =sc.next();
           String d =sc.next();
           s[h].assign(a,b,c,d);
        }
        for(int k=0;k<n;k++)
        {
            s[k].print();
        }
    }
}
}
