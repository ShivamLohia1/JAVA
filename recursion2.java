// package L5;

public class recursion2 {
        public static void print(int n)
        {
            if(n>4) return; 
            print(n+1);
            System.out.println(n);
           
        }
        public static void main(String[] args) {
            print(1);
    }
}