package conditional;
import java.util.Scanner;

public class checkPositiveNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an number to check postive or negative");
        int n = sc.nextInt();
        String message = (n>0) ? "Positve number" : "negative number";
        System.out.println(message);
        sc.close();
    }
}