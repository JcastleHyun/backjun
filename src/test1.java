import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String s = "";
        System.out.println(solution(s));

    }
    public static boolean solution(String s){
        boolean result = true;
        if(s=="")
            return false;
        for(int i =0;i < s.length();i++){
            if(Character.isDigit(s.charAt(i)) == false)
                return false;

        }
        return result;
    }
}
