package string;

public class findSubString {

    public static String subString(String str,int si, int ei){
        String substr = "";
        for(int i=si;i<ei;i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]){
        //subString

        String str = "HelloWorld";
        System.out.println(subString(str,1,5));
    }
    
}
