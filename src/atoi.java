public class atoi {
    public static void main(String[] args) {
        String str="4193 with words";
        str=str.trim();
        boolean isNegative=false;
        if(str.charAt(0)=='-'){
            isNegative=true;
        }
        str=str.replace("-","");
        int length=str.length();

        int number=0;

        for(char c:str.trim().toCharArray()){
            if(c>=48 && c<=58) {
                int n = (int) c - 48;
                int thousand = (int) Math.pow(10, length - 1);
                number = number + (n * thousand);
                length--;
            } else{

            }
        }
        number=isNegative?number*-1:number;
       //return  number;
    }
}
