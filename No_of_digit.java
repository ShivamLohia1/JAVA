// package Lecture_04_Function;
import java.util.*;
public class No_of_digit {
    public static int digit(int n){
        int count = 0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digit(n));
    }    

}
