// package Lecture_07_Searching.Linear;
public class Intro {
    static int search(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,-1,0,5,6,9};
        int target = 6;
        System.out.println(search(arr, target));
    }

}
