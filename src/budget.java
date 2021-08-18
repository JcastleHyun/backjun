import java.util.Arrays;

public class budget {
    public static int solution(int[] d, int budget){
        int result = 0;
        Arrays.sort(d);
        for(int i = 0; i<d.length;i++){
            if(budget-d[i]<0){
                break;
            }
            budget -= d[i];
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        int result = solution(d,budget);
        System.out.println(result);
    }
}
