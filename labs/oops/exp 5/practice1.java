class ex1 extends Exception
{
ex1(String s)
{
    super(s);
}
}
public class practice1 
{
    public static void main(String[] args) throws ex
    {
        int i=17;
        if(i<10)
        {
            System.out.println("i is less than 10");
        }
        else
        {
            throw new ex("queue overflow");
        }
    }
    
}
