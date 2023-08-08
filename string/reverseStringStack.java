package string;
import java.util.*;


public class reverseStringStack {
    public static String reversebyStack(char [] str)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length;i++)
        // push the characters into stack
            st.push(str[i]);
        
        for(int i=0;i<str.length;i++)
        {
            // Pop the characters of stack into the original string.

            str[i] = st.peek();
            st.pop();
        }

        return String.valueOf(str);
        // converting characters array to string
    }
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        str = reversebyStack(str.toCharArray());
        System.out.println(str);
    }
    
}
