import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Arrays;

public class ksnum {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{2,5,4}};
        int[] result = solution(array, commands);
        System.out.println(Arrays.toString(result));

    }

    public static int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length;i++){
            int[] cut_array;
            cut_array = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(cut_array);
            answer[i] = cut_array[commands[i][2]-1];
        }
        return answer;

    }
}
