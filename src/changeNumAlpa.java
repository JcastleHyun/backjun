import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class changeNumAlpa {
    public static int solution(String s){
        int result = 0;
        HashMap<String, String> alpha_to_num = new HashMap();
        alpha_to_num.put("zero","0");
        alpha_to_num.put("one", "1");
        alpha_to_num.put("two", "2");
        alpha_to_num.put("three", "3");
        alpha_to_num.put("four", "4");
        alpha_to_num.put("five", "5");
        alpha_to_num.put("six", "6");
        alpha_to_num.put("seven", "7");
        alpha_to_num.put("eight", "8");
        alpha_to_num.put("nine", "9");
        Pattern pt = Pattern.compile("^[a-zA-Z]*$");
        String word = "";
        String result_str = "";

        for(int i=0;i<s.length();i++){
            char s_char = s.charAt(i);
            Matcher match = pt.matcher(String.valueOf(s_char));
            if(match.find() == true)
                word += String.valueOf(s_char);
            else{
                result_str += String.valueOf(s_char);
            }
            if(alpha_to_num.containsKey(word)){
                result_str += alpha_to_num.get(word);
                word = "";
            }
        }
        result = Integer.parseInt(result_str);
        return result;
    }

    public static void main(String[] args) {
        String s = "23four5six7";
        System.out.println(solution(s));
    }
}
