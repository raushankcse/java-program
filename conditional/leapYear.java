package conditional;
import java.util.Scanner;
public class leapYear {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        /*
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0){
                    System.out.println("Leap year");
                }else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }
        */

        // altername solution

        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = ((year%100)==0 && (year%400)==0);

        if(x && (y || z))
        {
            System.out.println(year + " Leap Year");
        }
        else
        {
            System.out.println(year + " Not a leap year");
        }


        sc.close();
    }
}
