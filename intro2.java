public class intro2 {
    public static void main(String[] args) {
        String str = "Hello world. I am Shivam Lohia";
        System.out.println("Original: "+str);

        System.out.println(str.toUpperCase());
        System.out.println(str);

        System.out.println(str.toLowerCase());

        String fruits = "Apple,Mango,Grapes,Banana";
        String[] split = fruits.split(",");
        for(String i: split){
            System.out.print(i+" ");
        }
    }
}