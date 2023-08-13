package practiceQuestionOops;

import java.util.Scanner;

public class OopsComplex{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        Complex c = new Complex();
        System.out.println(c.sum(a,b));
        System.out.println(c.difference(a,b));
        System.out.println(c.product(a,b));
        
    }
}

class Complex{
    double sum(double a, double b)
    {
        return a+b;
    }
    double difference(double a,double b)
    {
        return a-b;
    }

    double product(double a,double b)
    {
        return a*b;
    }
}
