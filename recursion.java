// package L5;

public class recursion {
        static void print(int n)
        {
            if(n>4) return;
            System.out.println(n);
            print(n+1);
        }
        public static void main(String[] args) {
            print(1);
    }
}
