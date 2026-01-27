import java.util.*;
class Zumakazooo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(CheckZumaka(str));
    }

    public static String CheckZumaka(String s){
        int[] freq = new int[26];
        char[] str = s.toCharArray();
        HashSet <Character> set = new HashSet<>();
        for(int i=0;i<str.length;i++){
            freq[str[i]-'a']++;
            set.add(str[i]);
        }
        int cnt = 0;
        for(int i =0;i<26;i++){

            if(freq[i] == i+1){
                cnt++;
            }else if(freq[i]  == i+2){
                cnt +=2;
            }else if(freq[i] > 0 && freq[i] == i){
                cnt --;
            }
        }
        if(set.size() == cnt) return "Shortlisted";
        else if(set.size()+1 == cnt) return "More Shortlisted";
        else if(set.size()-2 == cnt) return "Less Shortlisted";
        return "Rejected";
    }
}