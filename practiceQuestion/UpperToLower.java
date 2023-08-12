package practiceQuestion;

public class UpperToLower {
    public static void main(String[] args)
    {
        for (char ch = 'A'; ch<= 'Z1';ch++)
        {
            System.out.println((char)(ch | ' '));
        }
    }
    
}
