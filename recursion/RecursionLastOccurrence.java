package recursion;

public class RecursionLastOccurrence {

    public static int lastOccurrence(int arr[], int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        int isFound = lastOccurrence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key)
        {
            return i;
        }

        return isFound;
    }
    public static void main(String args[])
    {
        int arr[] = {8,3,5,9,10,5,2,3};
        System.out.println(lastOccurrence(arr,5,0));
    }
    
}
