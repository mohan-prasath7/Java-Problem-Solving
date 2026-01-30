import java.util.*;
public class array_and_threshold {
    public static void main(String[] args){
        int[] arr ={5,8,10,13,6,2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Threshold Value : ");
        int t = sc.nextInt();
        int count = 0,threshold = 0;
        for(int i =0;i<arr.length;i++){
            int n = arr[i];
            threshold = t;
            while(n>0){
                count =count+(n/threshold);
                n %=threshold;
                threshold--;
            }
        }
        System.out.print(count);
    }
}
