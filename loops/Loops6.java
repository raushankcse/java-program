// print number from 1 to n
package loops;
import java.util.*;
public class Loops6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :  ");
        int range = sc.nextInt();
        int counter = 1;
        while(counter<=range){
            System.out.println(counter+ " ");
            counter++;
        }
    }
}
