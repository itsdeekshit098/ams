/*
 exp of how to do the program:
    1)firstly create a queue program
    2)then as in question it is said that to use throws and throw
    3)firstly if we come to throws let us assumme we said that enqueue might throw an exception queueException which is user defined w.k.t all user defined function are checked exceptions(which are caught by compiler during run time so when we add throws queueException then in main method where we call enqueue method compile time error will be showing that unhandled type) 
    4)so see as the method is called in main method then throws needs the exception need to be caught in the main method case 1 itself so we use try and keeps obj.enqueue() in it and the catch the queueExcetion 
    5)
 */

import java.util.Scanner;
class queueException extends Exception
{
    queueException(String s)
    {
        super(s);      
    }
}

class linearqueue
{
    int front=0;
    int rear=-1;
    int a[]=new int[100];
    int size=4;
    void enqueue(int ele) 
    {
        try{
        if(rear>size-1)
        {
            throw new queueException("queueoverflow");
            
        }
        else
        {
            rear=rear+1;
            a[rear]=ele;     
        }
        }   
        catch(queueException e)
        {
            e.getMessage();
        }
    }
    void dequeue()
    {
        if(front>rear)
        {
            System.out.println("no elements to delete");
        }
        else
        {
            System.out.println("deleted element is "+a[front]);
            front=front+1;
        }
    }
    void display()
    {
        if(front>rear)
        {
            System.out.println("no elements are in queue");
        }
        for(int i=front;i<rear;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        linearqueue obj=new linearqueue();
        int p=1;
        while(p>0)
        {
            System.out.println("1:enqueue 2:dequeue 3:display 4:exit");
            System.out.println("enter ur choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("enter the elelment to be inserted");
                    int k=sc.nextInt();
                    obj.enqueue(k);
                    break;
                    
                }
                case 2:
                {
                    obj.dequeue();
                    break;
                }
                case 3:
                {
                    obj.display();
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