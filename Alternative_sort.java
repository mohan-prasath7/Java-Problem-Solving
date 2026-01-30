import java.util.*;
public class Alternative_sort {
    public static void main(String[] args){
        int[] arr ={5,2,8,7,4,3,9};
        int[] res = new int[arr.length];
        arr =sorted(arr);
        int ind = 0;
        for(int i = 1;i<arr.length;i+=2){
            res[i] = arr[ind++];
        }
        ind = arr.length-1;
        for(int i =0;i<arr.length;i +=2){
            res[i] = arr[ind--];
        }
        for(int i: res) System.out.print(i+" ");
    }
    public static int[] sorted(int[] arr) {
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
