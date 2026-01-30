import java.util.*;
class z_pattern{
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ind =0,row =(str.length()+2),temp = (row/3)-1;
        if(row%3 == 0){
            for(int i =0;i<(row/3);i++){
                for(int j=0;j<(row/3);j++){
                    if(i == 0 || i == (row/3)-1 || j == temp && ind < str.length()){
                        System.out.print(str.charAt(ind)+" ");
                        ind++;
                    }else{
                        System.out.print("  ");
                    }
                }
                temp--;
                System.out.println();
            }
        }
        else{
            System.out.print("No");
        }
    }
}