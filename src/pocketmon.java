import java.util.*;

public class pocketmon {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums){
        int max_num = nums.length/2;
        HashSet nums_set = new HashSet();
        for (int num: nums) {
            nums_set.add(num);
        }
        if(max_num>nums_set.size())
            return nums_set.size();
        else
            return max_num;
    }
}
