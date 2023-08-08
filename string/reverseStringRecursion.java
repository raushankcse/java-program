package string;
import java.io.*;

public class reverseStringRecursion {
    static void recursiveReverse(char[] str, int i)
    {
        int n = str.length;
        if(i==n/2)
            return;
        
         // Swap the i and n-i-1 charcter
        swap(str,i,n-i-1);

        recursiveReverse(str, i+1);
        
        

    }
    static void swap(char[] arr,int i,int j)
    {
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args)
    {
        char[] str = "geeksforgeeks".toCharArray();
        recursiveReverse(str, 0);
        System.out.println(String.valueOf(str));

    }

    
}
