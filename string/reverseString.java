package string;

public class reverseString {
    public static void main(String args[])
    {
        String str = "geeksforgeeks";

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
    
}
