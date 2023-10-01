package loops;

public class Loops9 {
    public static void main(String args[]){
        int n = 4567;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
        System.out.println();
    }
}
