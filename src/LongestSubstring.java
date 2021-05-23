import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static void main(String[] args) {
        int max=mySlidingWindow("pwwkew");
        System.out.println(max);
    }
    private static int mySlidingWindow(String str) {
        int a_pointer=0, b_pointer=0, max=0;
        Set<Character> hash_set=new HashSet<>();
        while(b_pointer<str.length()){
            char c=str.charAt(b_pointer);
            if(!(hash_set.contains(c))){
                hash_set.add(c);
                b_pointer++;
                max=Math.max(max,hash_set.size());
            } else{
                hash_set.remove(  str.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}