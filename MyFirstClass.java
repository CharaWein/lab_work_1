package First;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 2; i <= 100; i++){
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int a){
        for(int j = 2; j <= Math.sqrt(a); j++){
            if(a % j == 0){
                return false;
            }
        }
        return true;
    }
}