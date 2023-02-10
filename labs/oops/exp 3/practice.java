import java.util.Scanner;
public class practice {
public static void main(String[] args) {
    System.out.println("enter the string to be reversed");
    Scanner sc=new Scanner(System.in);
    String k=sc.nextLine();//note both input string and string to
    String reversed=" ";
    char ch;
    for(int i=0;i<k.length();i++)
    {
        ch=k.charAt(i);
        reversed=ch+reversed;//see what 
    }
    System.out.println(reversed);
}    
}
