import java.util.*;
class Nth_term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth Term : ");
        int n = sc.nextInt();
        System.out.print(findNthTernm(n));
    }
    public static int findNthTernm(int n){
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(3);
        lst.add(7);
        int incr = 0;
        int len = (n/2)-1;
        while(incr < len){
            lst.add(lst.get(incr)*10+3);
            lst.add(lst.get(incr)*10+7);
            incr++;
        }
        return lst.get(n-1);
    }
}
