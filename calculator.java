import java.util.Scanner;

public class calculator {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first num");
        float a= sc.nextFloat();
        System.out.println("Enter second num");
        float b = sc.nextFloat();
        System.out.println("Choose operation to perform");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':{
                System.out.println("Sum = "+(a+b));
                break;
            }
            case '-':{
                System.out.println("difference = "+(a-b));
                break;
            }
            case '*':{
                System.out.println("Multiplication = "+(a*b));
                break;
            }
            case '/':{
                System.out.println("Division = "+(a/b));
                break;
            }
            default :
                System.out.println("Enter valid operator!!!!");
        }
    }

}
