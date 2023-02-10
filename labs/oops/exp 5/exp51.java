import java.util.Scanner;
class queueException extends Exception{
    queueException(String s)
    {
        super(s);
    }
}
class exp55
{
    static int size;
    static int ele;
    int rear=-1;
    int front=0;
    int queue[]=new int[100];
    void enqueue(int ele)
    {
    try{
        if(rear<size-1)
        {
            rear=rear+1;
            queue[rear]=ele;
        }
        else
        {
            throw new queueException("queue overflow");
        }
    }
    catch(queueException e)
    {
        System.out.println(e.getMessage());
    }

    }
    void dequeue() throws queueException
    {
            if(front<=rear)
            {
                System.out.println("deleted element is + "+queue[front]);
                front=front+1;
            }
            else
            {
                throw new queueException("queue underflow or no element to delete");
            }

    }
    void display()
    {
        try{
        if(rear!=-1 && front<=rear)
        {
            System.out.println("the elements of the queue are:");
            for(int i=front;i<=rear;i++)
            {
                System.out.println(queue[i]);
            }

        }
        else
        {
            throw new queueException("no elements to dsiplay");
        }
    }
        catch(Exception ee)
        {
            System.out.println(ee.getMessage());
        }
       
    }
    public static void main(String[] args) 
    {
        exp55 obj=new exp55();
        Scanner sc=new Scanner(System.in);
        int t=1;
        System.out.println("enter the size of queue(less than 100");
        size=sc.nextInt();
        while(t>0)
        {

            System.out.println("enter urs choice: ");
            System.out.println("1:enqueue 2:dequeue 3:display 4:exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("enter the element to be inserted");
                    ele=sc.nextInt();
                    obj.enqueue(ele);
                    break;
                }
                case 2:
                {
                    try
                {
                    obj.dequeue();
                }
                catch(queueException e)
                {
                    System.out.println(e.getMessage());
                }
                break;
                }
                case 3:
                {
                    obj.display();
                    break;     
                }
                case 4:
                {
                    t=0;
                    break;
                }
            }
        }                  
    }
}
