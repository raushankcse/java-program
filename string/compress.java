package string;

public class compress {

    public static String compressLetter(String str)
    {
        StringBuilder newstr = new StringBuilder("");
        // abc

        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count);
            }
        }
        return newstr.toString();
    }

    public static void main(String args[]){
        String str = "aabbccdcc";
        System.out.println(compressLetter(str));
    }
    
}
