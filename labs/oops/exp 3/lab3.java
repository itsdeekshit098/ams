//https://www.geeksforgeeks.org/reverse-a-string-in-java/
import java.util.Scanner;
class lab3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    //i))))
        //STRINGS length and capacity
        String s1=new String("hansi");
        System.out.println(s1.length());
        //System.out.println(s1.capacity()); //u cant print capacity of a string bcz there wont be any capacity w.r.t stringBuffer bcz it can hold whatever u have given to it.that is why u need to create another object to store concatenated string           string h="hasni";                                  String k=h.concat("aa");


        //STRINGBUFFER length and capacity
        StringBuffer sb1=new StringBuffer();
        StringBuffer obj1=new StringBuffer();//stringbuffer with default size without input
        System.out.println(obj1.length());//length will be 0
        System.out.println(obj1.capacity());
        StringBuffer obj2=new StringBuffer("hasni");
        System.out.println(obj2.length());
        System.out.println(obj2.capacity());//capacity=no.of.iniatiazedobj+16==21
        obj2.append("01234567899");//now here we added +11 character so 11+5=16(noofcharsin "hansi")
         obj2.append("1");//now 16+1==17(now also as capacity is 21 now there will be 17 u might think that 16is capacity so croseed that so capacity should become w.r.t(oldcapacity*2)+2) 
        System.out.println(obj2.capacity());
        obj2.append("12345");//now 17+5==22 so crosses 21 so jvm on its own increases the capacity of the object of type stringBuffer as per the following formulae ==((oldcapacity*2)+2)

        StringBuffer s3=new StringBuffer(50);//StringBuffer(int): Creates an empty string buffer with the specified initial capacity.
        System.out.println(s3.capacity());//

    //ii)))))

    






    }
}