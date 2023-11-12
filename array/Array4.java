// find the largest number in a given array
package array;

import java.util.*;
public class Array4 {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,4,5};
        System.out.println("largest value is: "+ getLargest(numbers));
    }
    
}
