package Switch;
import java.util.Scanner;

public class weekName {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int weekNumber = sc.nextInt();

        switch(weekNumber)
        {
            case 1 -> System.out.println("Monday") ;
                
            case 2 -> System.out.println("Tuesday");
                
            case 3-> System.out.println("Wednesday");
                
            case 4-> System.out.println("Thursday");
                
            case 5-> System.out.println("Friday");
                
            case 6-> System.out.println("Saturday");
                
            case 7-> System.out.println("Sunday");
                
            default -> System.out.println("Not a week day");
        }
        sc.close();
    }
}
