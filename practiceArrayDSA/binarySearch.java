public class binarySearch {

    static int binarySearching(int arr[],int low,int high,int key)
    {
        if(high<low)
            return -1;
        int mid = (low+high)/2;
        if (key==arr[mid])
            return mid;
        if(key>arr[mid])
            return binarySearching(arr, (mid+1), high, key);
        return binarySearching(arr, low, (mid-1), key);
    }
    
    public static void main(String[] args)
    {
        int arr[] = {5,6,7,8,9,10};
        int n,key;
        n=arr.length-1;
        key=5;

        // Function call
        System.out.println("Index: " + binarySearching(arr,0,n,key));
    }
    
}
