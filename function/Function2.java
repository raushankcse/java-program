package function;

import java.util.Scanner;

public class Function2 {
    public static void calculateSum(int num1, int num2){
        int sum = num1+num2;
        System.out.println("sum is : "+sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        calculateSum(a,b);
    }
}
