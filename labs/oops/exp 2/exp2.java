/*
points for exam:
1)import java.lang.Math
3)toString is the defined method in java which returns the string representation of an object. 
4)getClass() method returns string representation of an obj
5)getName() method returns the name of the class but we need to use getName() along with get class
NOTE:
    1)the scope of the instance variables will be as per the access modifier.but scope of variable in method will be upto the method itself.it means if instance variable is declared in class can be accessed in any other classes of the same package
    
 */
import java.lang.Math;
abstract class shape
{
    static float pi=3.14f;
    static String shapename="hansi";
    abstract void area();
    public String toString()
    {
        return getClass().getName();
    }
}
    class sphere extends shape
    {
        static double radius=4;
        void area()
        {
           
           System.out.println("area of circle ="+(4*pi*(Math.pow(radius,2))));
        }
        
    }

    class rectangle extends shape
    {
        int length=10;
        int breadth=5;
        void area()
        {
            double areaofrectangle=(length*breadth);
            System.out.println("areaofrectangle= "+(length*breadth));
        }
    }

    class triangle extends shape
    {
        int base=5;
        int height=5;
        void area()
        {
           System.out.println("areaoftriangle= "+(0.5*base*height));
        }
    }

    class Display{
        public static void main(String[] args) 
        {
            sphere obj=new sphere();
            rectangle obj1=new rectangle();
            triangle obj2=new triangle();
            obj.area();
            System.out.println(obj.toString());
            obj1.area();
            System.out.println(obj1.toString());
            obj2.area();
            System.out.println(obj2.toString());
        }
    }