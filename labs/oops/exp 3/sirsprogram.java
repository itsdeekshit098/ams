import java.util.*;
class Cases
{
 //length and capacity of string and stringbuffer
 String s="Jain University"; //String initialization
 StringBuffer sb1=new StringBuffer(); //String buffer with default size but no input
 StringBuffer sb2=new StringBuffer("SETJU"); //String buffer with input
 StringBuffer sb3=new StringBuffer(50); //String buffer with capacity input
 void demo1()
 {
 System.out.println("Case1");
 System.out.println("with input, string length is: "+s.length()); //String length
 System.out.println("Before input, stringbuffer length is: "+sb1.length()); //StringBuffer length System.out.println("With input, stringbuffer length is: "+sb2.length());
 System.out.println("With capacity input, stringbuffer length is: "+sb3.length());
 System.out.println("Before input, stringbuffer length is: "+sb1.capacity()); /* StringBuffer
 capacity */
 System.out.println("With input, stringbuffer length is: "+sb2.capacity());
 System.out.println("With capacity input, stringbuffer length is: "+sb3.capacity());
 }
 String demo2(String read)
 {
 String reverse = "";
 int i=read.length()-1;
 while(i>=0) {
 reverse = reverse + read.charAt(i--);
 }
 return reverse;
 }
 String demo3(String read1, String read2)
 {
 return read1.concat(read2);
 }
 void demo4(String read)
 {
 System.out.println("\nCase4");
 System.out.println("Given only begining index as 2 "+read.substring(2));
 System.out.println("Given begining and end index as (2 to 4) "+read.substring(2,4));
 }
}
public class sirsprogram {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 Cases c1=new Cases();
 c1.demo1();
 System.out.println("\nCase2");
 System.out.println("Enter string to reverse: ");
 String s1=sc.nextLine();
 String res1=c1.demo2(s1);
 System.out.println("Reversed string is "+ res1.toUpperCase());
 System.out.println("\nCase3");
 System.out.println("Enter string to append: ");
 String s2=sc.nextLine();
 String res2=c1.demo3(res1,s2);
 System.out.println("Concatenated string is "+res2);
 c1.demo4(res2);
 }
}
