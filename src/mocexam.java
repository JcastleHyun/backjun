import javax.print.DocFlavor;
import java.util.*;

public class mocexam {
    public static void main(String[] args) {
        int[] answer={1,3,2,4,2};
        int[] result = solution(answer);
    }
    public static int[] solution(int[] answer){
        int[] st_a = {1,2,3,4,5};
        HashMap st_result = new HashMap();
        st_result.put(1,0);
        st_result.put(2,0);
        st_result.put(3,0);
        int[] st_b = {2,1,2,3,2,4,2,5};
        int[] st_c = {3,3,1,1,2,2,4,4,5,5};


        for(int i = 0; i<answer.length; i++){
            if (answer[i] == check(i, st_a)){
                int num = (int) st_result.get(1) + 1;
                st_result.put(1,num);
            }
            if (answer[i] == check(i, st_b)){
                int num = (int) st_result.get(2) + 1;
                st_result.put(2,num);
            }
            if (answer[i] == check(i, st_c)){
                int num = (int) st_result.get(3)+ 1;
                st_result.put(3,num);
            }

        }
        return get_resut(st_result);


    }
    public static int check(int i, int[] st){
        if(st.length-1 < i){
            return st[i%st.length];
        }else {
            return st[i];
        }
    }

    public static int[] get_resut(HashMap st_result){
        int max = 0;
        int count = 0;
        HashSet<Integer> result_set = new HashSet();
        max = (int)st_result.get(1);
        if(max < (int)st_result.get(2))
            max = (int)st_result.get(2);
        if(max < (int)st_result.get(3))
            max = (int) st_result.get(3);
        for (Object ob: st_result.keySet()) {
            if(max == (int)st_result.get(ob))
                result_set.add((int)ob);
        }
        int[] result = new int[result_set.size()];

        for (int num: result_set) {
            result[count] = num;
            count++;
        }
        return result;
    }



    }


