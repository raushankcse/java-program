package practiceArrayDSA;

public class reverseArray {
    // static void reverseArr(int arr[], int start , int end){
    //     int temp;
    //     while(start<end)
    //     {
    //         temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }


    // }

    static void reverseArr(int arr[] , int start, int end)
    {
        int temp;
        if (start>=end)
            return;
        temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArr(arr,start+1, end-1);
    }

    static void printArr(int arr[],int size){
        for(int i =0;i<size;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }



    public static void main(String args[])
    {

        int arr[] = {1,2,3,4,5,6};
        printArr(arr,arr.length);
        reverseArr(arr,0,arr.length-1);
        System.out.println("reversed array is");
        printArr(arr,arr.length);
    }


    
}
