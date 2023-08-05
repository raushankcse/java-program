package string;

import java.util.Scanner;

public class string{
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};

        String str = "abcd";
        String str2 = new String("xyz");
        // Strings are Immutable

        Scanner sc = new Scanner(System.in);

        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        String firstName = "Raushan";
        String lastName = "Kumar";

        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // System.out.println(fullName.charAt(1));


        printLetters(fullName);

        
    }

    public static void printLetters(String str) {
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();
    }

}