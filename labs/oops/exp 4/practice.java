
class LessBalanceException extends Exception
{
    LessBalanceException(String s)
    {
        
    }
}
class practice 
 {
    static void kkr()
    {
        try
        {
            throw new LessBalanceException("enterd amount is invalid");
        }
        catch(LessBalanceException e)
        {
                System.out.println(e.getMessage());
        }  

    }
    public static void main(String[] args) {
        kkr();
    }
        
    }    
