import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    //https://leetcode.com/problems/zigzag-conversion/solution/
    public static void main(String[] args) {
        String output=convert("PAYPALISHIRING", 4);
        System.out.println(output);
    }
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        List<StringBuilder> rows = new ArrayList<>();
        int curRow = 0;
        boolean goingDown = false;

        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1){
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }
        String str="";
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            str+=rows.get(i).toString();
        }
        return str;
    }

    }
