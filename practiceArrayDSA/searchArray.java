class searchArray{
    static int findElement(int arr[],int n, int key)
    {
        for(int i=0;i<n;i++)
            if(arr[i]==key)
                return i;

        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = {12,40,10,6,40};
        int n = arr.length;
        
        //using a last element as search element
        int key=40;

        //function call
        int position = findElement(arr,n,key);

        if(position== -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at Position: " + (position+1));

    }
}