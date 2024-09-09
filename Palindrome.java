package First;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            String s = in.nextLine();
            if (isPalindrome(s)){
                System.out.println("Палиндром");
            } else {
                System.out.println("Не палиндром");
            }
        }
    }
    public static String reverseString(String s){
        String s1 = "";
        for(int i = 0; i < s.length(); i++){
            s1 += s.charAt(s.length()-i-1);
        }
        System.out.println(s1);
        return s1;
    }
    public static boolean isPalindrome(String s){
        if(s.equals(reverseString(s))){
            return true;
        } else {
            return false;
        }
    }
}
