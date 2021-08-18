import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collection;
import java.util.Collections;

public class test2 {
    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

    }

        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Arrays.sort(participant);
            Arrays.sort(completion);
            for(int i = 0; i<completion.length;i++){

                if (!participant[i].equals(completion[i]) ){

                    return participant[i];
                }
            }
            answer = participant[participant.length-1];
            return answer;
        }
    }


