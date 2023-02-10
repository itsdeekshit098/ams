class ex extends Exception
{
ex(String s)
{
    super(s);
}

}

class practice
{
public static void main(String[] args) {
    int i=10;
    try{
    if(i<10)
    {
        System.out.println("less than 10");
    }
    else
    {
        throw new ex("hansi");
    }
}
catch(ex e)
{
    System.out.println(e.getMessage());
}
}
}