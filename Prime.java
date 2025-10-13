// package Lecture_04_Function;
import java.util.*;
public class Prime {
    public static int prime(int n){
        int isPrime = 1;
        for(int i = 2;i*i<=n;i++){
            if(n%i==0){
                isPrime = 0;
                break;
            }
        }
        if(isPrime==1) return 1;
        else return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(prime(n));
    }

}

