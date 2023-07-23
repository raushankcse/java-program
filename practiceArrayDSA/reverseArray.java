package practiceArrayDSA;

public class reverseArray {
    static void reverseArr(){


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
        System.out.println("reversed array is");
        reverseArr();
        printArr(arr,arr.length);
    }


    
}
