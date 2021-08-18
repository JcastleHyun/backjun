import java.util.ArrayList;

import java.util.Arrays;

public class screteMap {
    public static void main(String[] args) {
        int num = 5;
        int[] arr1 = {20};
        int[] arr2 = {1};
        solution(num, arr1, arr2);
    }
    public static String[] solution(int n, int[] arr1, int[] arr2){
        String[] result = {};
        ArrayList<String> result_arr = new ArrayList();
        for (int i = 0; i<arr1.length; i++){
            String binary = Integer.toBinaryString((arr1[i] | arr2[i]));
            result_arr.add(transform(binary));
        }
        result = result_arr.toArray(new String[result_arr.size()]);
        return result;

    }
    public static String transform(String binary){
        String result = binary;
        result = result.replace("1","#");
        result = result.replace("0", " ");
        return result;
    }

}
