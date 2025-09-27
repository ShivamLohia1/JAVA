public class arrays {
    public static void main(String[] args) {
        int arr [] = {10,20,-4,0,1};

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        for(int element : arr){
            System.out.println(element);
        }
    }
}

