package string;
public class booleanString{
    public static void main(String[] args)
    {
        String test = "software";
        CharSequence seq = "soft";
        boolean bool = test.contains(seq);
        System.out.println("Found Soft?:" + bool);

        // Returns true substring if found.
        boolean seqFound = test.contains("war");
        System.out.println("Found war? "+seqFound);

        // Returns true substring if found
        // otherwise return false
        boolean sqFound = test.contains("wr");
        System.out.println("Found wr?: " + sqFound);
    }
}