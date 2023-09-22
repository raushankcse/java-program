package conditional;

public class Ternary {
    public static void main(String args[]){
        int number=4;
        // ternary operator
        String type = ((number%2)==0) ?"even" : "Odd";
        System.out.println(type);
    }
    
}
