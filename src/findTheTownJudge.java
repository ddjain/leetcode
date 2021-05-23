import java.util.HashMap;
import java.util.Map;

public class findTheTownJudge {
    public static void main(String[] args) {
        //int[] [] peoples=  {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int[][] peoples={{1,2},{2,1}};
        findJudge(4,peoples);
    }

    public static int findJudge(int n, int[][] trust) {
        Map<Integer,Integer> judges=new HashMap<>();
        if(trust.length==0){
            return  n;
        }
        for(int[] peoples: trust){
            int person1=peoples[0], person2=peoples[1];
            if(judges.containsKey(person1)){
                judges.remove(person1);
            }
            if(judges.get(person2)!=null) {
                int count=judges.get(person2);
                judges.put(person2,++count);
            } else {
                judges.put(person2,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : judges.entrySet()) {
            if(entry.getValue()==(n-1)){
                return entry.getKey();
            }
        }
        return -1;
    }
}
