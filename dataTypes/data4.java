import java.util.Scanner;

public class data4 {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int eraser = sc.nextInt();
        float rate = pencil + pen + eraser;

        float total = rate +  rate*(0.18f);
        System.out.println(total);
        sc.close();
    }
}
