import java.util.Random;
import java.util.Scanner;
public class Quick  
{  
    /* function that consider last element as pivot,  
place the pivot at its exact position, and place  
smaller elements to left of pivot and greater  
elements to right of pivot.  */  
int partition (int a[], int start, int end)  
{  
    int pivot = a[end]; // pivot element  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
        // If current element is smaller than the pivot  
        if (a[j] < pivot)  
        {  
            i++; // increment index of smaller element  
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
}  
  
/* function to implement quick sort */  
void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */  
{  
    if (start < end)  
    {  
        int p = partition(a, start, end);  //p is partitioning index  
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
}  
  
/* function to print an array */  
void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) 
    {  
    Random generator = new Random();
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter size");
    int k=sc.nextInt();
    int a[] =new int[k];
    for(int i=0;i<k;i++)
    {
        a[i]=generator.nextInt(k);
    }
    int n = a.length;  
    long startTime = System.nanoTime();
    System.out.println("\nBefore sorting array elements are - ");
    Quick q1 = new Quick();  
    q1.printArr(a, n);  
    q1.quick(a, 0, n - 1);  
    long stopTime = System.nanoTime();
    long elapseTime = (stopTime - startTime);
    System.out.println(" ");
System.out.println("Time taken to sort array is:" + elapseTime + "nanoseconds");
    System.out.println("\nAfter sorting array elements are - ");  
    q1.printArr(a, n);  
    System.out.println();  
    }  
}
