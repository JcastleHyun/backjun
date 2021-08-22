import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class keypad {
    public static void main(String[] args) {
        int[] r = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String result = solution(r,"right");
        System.out.println(result);
    }
    public static String solution(int[] numbers, String hand){

        StringBuilder result = new StringBuilder();
        String[][] origin_num = {{"1","2","3"},{"4","5","6"},{"7","8","9",},{"*","0","#"}};
        HashMap<String, String> num_hash = new HashMap<>();
        for(int i = 0; i<origin_num.length; i++)
            for(int j=0; j<origin_num[0].length; j++){
                String str = Integer.toString(i) + "," + Integer.toString(j);
                num_hash.put(origin_num[i][j], str);
            }
        HashMap<String,String> right = new HashMap<>();
        HashMap<String, String> left = new HashMap<>();
        right.put("R","3,0");
        left.put("L","3,2");
        for(int i = 0 ; i<numbers.length; i++){
            String str_i = Integer.toString(numbers[i]);
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                result.append("L");
                left.put("L", num_hash.get(str_i));
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                result.append("R");
                right.put("R",num_hash.get(str_i));
            }
            else {
                int r = find_maxrix(right.get("R"),num_hash.get(str_i));
                int l = find_maxrix(left.get("L"),num_hash.get(str_i));
                if(r>l){
                    result.append("L");
                    left.put("L", num_hash.get(str_i));
                }
                else if (l>r){
                    result.append("R");
                    right.put("R", num_hash.get(str_i));
                }
                else{
                    if(hand.equals("left")){
                        result.append("L");
                        left.put("L", num_hash.get(str_i));
                    }else if (hand.equals("right")){
                        result.append("R");
                        right.put("R", num_hash.get(str_i));
                    }
                }
            }
        }
        return result.toString();
    }
    public static int find_maxrix(String coord, String num_coord){
        int x = Integer.parseInt(coord.split(",")[0]);
        int y = Integer.parseInt(coord.split(",")[1]);
        int num_x = Integer.parseInt(num_coord.split(",")[0]);
        int num_y = Integer.parseInt(num_coord.split(",")[1]);
        int result = Math.abs(num_x-x) + Math.abs(num_y-y);
        return result;


    }
}
