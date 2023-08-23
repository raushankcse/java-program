package recursion;

public class RecursionAllOccurrence {
    public static void AllOccurrence(int arr[] ,int k, int i)
    {
        if(i==arr.length)
        {
            return;
        }

        if(arr[i]==k)
        {
            System.out.print(i+" ");
        }
        AllOccurrence(arr, k, i+1);
       
    }
    public static void main(String args[])
    {
        int arr[] = {3,2,5,3,2,5,7,8,3,2};

        AllOccurrence(arr, 2, 0);

    }
    

    
}
