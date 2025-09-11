// package Lecture_05_Recursion;
import java.util.*;
public class Fibonacci {
    public int fib(int n){
        if (n == 0) return 0;  
        if (n == 1) return 1; 
        return fib(n-1)+fib(n-2);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
      Fibonacci fn = new Fibonacci(); 
      int n = sc.nextInt();
      System.out.println(fn.fib(n));  
   } 
}