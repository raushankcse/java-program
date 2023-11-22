// max subarray sum , kadane's
package array;

import java.util.*;

public class Array11 {
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int ls=0;
        for(int i=0;i<numbers.length;i++){
            ls = ls+numbers[i];
            if(ls<0){
                ls=0;
            }
            ms = Math.max(ls, ms);
        }
        System.out.println("our max subarray sum is : " + ms);
    }
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,5,-3};
        kadanes(numbers);
    }
}
