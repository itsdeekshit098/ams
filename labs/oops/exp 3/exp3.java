

/*
 * important points for exam:
    1)strings dont have method capaccity ncz they are immutable
    2)stringbuffers capacity is 16 by default.if stringBuffer h=new StringBuffer("kkr") then capacity is 3(length od sb)+16==>19 
    3)i found one method to concatenate string to same string itself
        String k=hansi;
        k.cncat("kdt");//does nothing
        sout(k);//prints hasni
        k=k.concat(kdt);
        sout(k);//prints hansikdt
    4)note to copy to reversedstring to a instance variable so that u can append it as in 3rd problem bcz var in method will be upto methods itself

 */
import java.util.*;
class SSB
{
    String h=new String("hasni");
    StringBuffer v=new StringBuffer("chinni");
    void stringandstringbuffer()
     {
          //length and capacity of string
    System.out.println(h.length());
    //System.out.println(h.capacity()); there wont be anything like capacity for string bcz string are immutable

    //length and capacity of stringBuufer
    System.out.println(v.length());
    System.out.println(v.capacity());
    //how to add string to other string
    h=h.concat("hansi");
    System.out.println("kk"+h);
    
    //after cancatenating something into string


    System.out.println(h.length());
    //assingning concatenated string to new string bcz sstrings are mutable so the same string cant append or include that string

    String tt=h.concat("tdr");

    //after concatenating string buffer

    v.append("hansi");
    System.out.println(v);
    System.out.println(v.length());
    System.out.println(v.capacity());
    //apending more than 16 characters
    v.append("012345678911");
    System.out.println(v.length());
    System.out.println(v.capacity());//((oldcapacity*2)+2)


     }
}
class reversestring
{
    String reversedtobeused;
    String reversedtobeused1;
    void reverse_string()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string u want to reverse");
        String input=sc.nextLine();
        char ch;
        String reversedString="";
        for(int i=0;i<input.length();i++)
        {
            ch=input.charAt(i);
            reversedString=ch+reversedString;
        }
        String hu=reversedString.toUpperCase();
        System.out.println(hu);
        //System.out.println(reversedString);
        this.reversedtobeused=reversedString;
    }
    void append1()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the string u want to append for above string");
        String nappend=sc1.nextLine();
        nappend=reversedtobeused+nappend;
        System.out.println(nappend);
        reversedtobeused1=nappend;
        
    }
    void substring11()//bcz substring is default method(ot avoid confusion) but u can use substring also directly
    {
        //syntax string(begin index,endindex);
        System.out.println("string with only starting index");
        System.out.println(reversedtobeused1.substring(2));
        System.out.println("string with both starting and end index");
        System.out.println(reversedtobeused1.substring(1,3));
        
    }
}
class exp3
{
    public static void main(String[] args) {
        SSB obj=new SSB();
        reversestring obj1=new reversestring();
        obj.stringandstringbuffer();
        obj1.reverse_string();
        obj1.append1();
        obj1.substring11();
    }
}
