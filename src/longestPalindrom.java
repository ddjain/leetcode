public class longestPalindrom {
    public static void main(String[] args) {
       String str="racecar";
       int start=0,end=0;
       for(int i=0;i<str.length();i++){
            int len1=getStringFromMiddle(str,i,i);
            int len2=getStringFromMiddle(str,i,i+1);
            int len=Math.max(len1,len2);

       }

    }
    public static int getStringFromMiddle(String s, int left, int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return (right-left-1);
    }
}
