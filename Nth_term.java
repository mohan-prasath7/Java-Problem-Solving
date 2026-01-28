import java.util.*;
class Nth_term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth Term : ");
        int n = sc.nextInt();
        System.out.print(findNthTernm(n));
    }
    // public static int findNthTernm(int n){
    //     ArrayList<Integer> lst = new ArrayList<>();
    //     lst.add(3);
    //     lst.add(7);
    //     int incr = 0;
    //     int len = (n/2)-1;
    //     while(incr < len){
    //         lst.add(lst.get(incr)*10+3);
    //         lst.add(lst.get(incr)*10+7);
    //         incr++;
    //     }
    //     return lst.get(n-1);
    // }
        public static String findNthTernm(int n){
            String res = Integer.toBinaryString(n+1);
            StringBuilder sb = new StringBuilder();
            for(int i =1;i<res.length();i++){
                if(res.charAt(i) == '0'){
                    sb.append('3');
                }else{
                    sb.append('7');
                }
            }
            return sb.toString();
        }
}
