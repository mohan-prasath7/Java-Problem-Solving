import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String[] words={"catch","got","tiger","mat","eat","pat","mat","tap","tea"};
        for(String i: words){
            if(anagram(i,str)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static boolean anagram(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<26;j++){
                if(s1.charAt(i)-'a' == j) freq[j]++;
            }
        }
        for(int i=0;i<s2.length();i++){
            for(int j=0;j<26;j++){
                if(s2.charAt(i)-'a' == j) freq[j]--;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i] > 0) return false;
        }
        return true;
    }
}
