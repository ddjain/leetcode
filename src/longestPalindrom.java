public class longestPalindrom {
    //https://leetcode.com/problems/longest-palindromic-substring/solution/
    public static void main(String[] args) {
       String str="acdaoppoacfe";
       int start=0,end=0;
       int max=0;
       for(int i=0;i<str.length();i++){
            int len1=getStringFromMiddle(str,i,i);
            int len2=getStringFromMiddle(str,i,i+1);
            int len=Math.max(len1,len2);
            if (len > end - start) {
               start = i - (len - 1) / 2;
               end = i + len / 2;
           }

       }
        System.out.println(str.substring(start, end + 1));
    }
    public static int getStringFromMiddle(String s, int left, int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return (right-left-1);
    }
}
