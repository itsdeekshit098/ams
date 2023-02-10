import java.util.Scanner;
class Stack
{
    static int a[];
    static int top=-1;//bcz top value should be only one copy if once value changed it should be same everywhere in the programs  
    static int n;//sizeof array     
    static void push(int ele)
    {
        if(top==n-1)
        {
            System.out.println("stack is full");
        }
        else
        {
            top=top+1;
            a[top]=ele;
        }
            
    }
    static void pop()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");
        }
        else
        {
            System.out.println("the deleted element is "+a[top]);
            top=top-1;
        }
    }
    static void display()
    {
        if(top<0 || top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.print(a[i]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("enter the size of stack");
        n=sc1.nextInt();
        a=new int[n];
        
        int p=1;
        while(p>0)
        {
            System.out.println("enter ur choice");
            System.out.println("1:push 2:pop 3:Display 4:exit");
            int c=sc1.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("enter the element to be inserted");
                    int r=sc2.nextInt();
                    push(r);
                    break;
                case 2:
               {
                    pop();
                    break;
               } 
               case 3:
               {
                    System.out.println("the elements of the stack are :");
                    display();
                    break;
               }
               case 4:
               {
                    p=0;
                    break;
               }
            }
        }
        
    }
}
