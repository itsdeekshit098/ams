package LAB1;

import java.util.Scanner;
class Student 
{
    String USN;
    String Name;
    String Branch;
    String Phone;
    Student()
    {

    }

    Student(String USN,String Name,String Branch,String Phone)
    {
        this.USN=USN;
        this.Name=Name;
        this.Branch=Branch;
        this.Phone=Phone;
    }
    void Display()
    {
        System.out.println(USN+" "+Name+" "+Branch+" "+Phone);
    } 
    public static void main(String args[])
    {
        Student obj1=new Student();//no use here in this program with this//see if u want to create obj of a class where constructor is there make sure to crete a non parameterized constructor
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter how many objects u wanted to create");
        int n=sc1.nextInt();
        Student objarray[]=new Student[n];
        //or
        //Student[] objarray=new Student[n]; //initialization of object array refer link for clarity
        for(int i=0;i<n;i++)
        {
            Scanner sc2=new Scanner(System.in);
            System.out.println("enter USN,Name,Branch,Phone");
            String USN=sc2.nextLine();
            String Name=sc2.nextLine();
            String Branch=sc2.nextLine();
            String Phone=sc2.nextLine();
            objarray[i]=new Student(USN,Name,Branch,Phone);//Student class instance with given values will be stored in objarray[i]
        }
        for(int j=0;j<n;j++)
        {
            objarray[j].Display();//objarray[j] is an member of objectarray that each member is obj which is an instance of a class with values assigned by for loop obove.so as we call constructor or method in main method (obj.methodname())in similar way we call display method int that object(which is an instance of student class with values given to variable) 
        }
    }   
}

