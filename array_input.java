import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array");
        int n = sc.nextInt();
        
        int nums [] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            nums [i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array Elements are:");
        for(int x : nums){System.out.println(x+" ");
        }
    }

}

