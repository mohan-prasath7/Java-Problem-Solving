import java.util.*;
public class binary_search{
    public static void main(String[] args){
        int[] arr = {0,1,1,2,4,5,6,7};
        System.out.print("Enter the target Num : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int left = 0,right = arr.length-1,mid =0,flag=0;
        while(left<right ){
            mid = (left+right)/2;
            if(arr[mid ] == target){
                System.out.print(mid);
                flag = 1;
                break;
            }else if(arr[mid] > target){
                right = mid-1;
            }else if(arr[mid] < target){
                left = mid+1;
            }
        }
        if(flag == 0){
            mid = (left+right)/2;
            if(arr[mid] == target) System.out.print(mid+" ");
        }else{
            System.out.print("Error : Target Not Found !!");
        }
       
    }
}