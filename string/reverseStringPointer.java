package string;
import java.io.*;

public class reverseStringPointer {

    static void reverseStr(String str)
    {
        int n = str.length();
        char [] ch = str.toCharArray();
        char temp;

        // Swap characters starting from two
        // corners
        // i is the left pointer and j is the right pointer
        
        for(int i=0,j=n-1;i<j;i++,j--)
        {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }

        System.out.println(ch);
    }
    public static void main(String args[]) {
        String str = "geeksforgeeks";
        reverseStr(str);
    }
    
    
}
