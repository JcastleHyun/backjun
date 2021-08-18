public class Npnum {
    public static void main(String[] args) {
        int[] absolute = {1,2,3};
        boolean[] signs = {false,false,true};
        int result = solution(absolute,signs);
        System.out.println(result);
    }
    public static int solution(int[] absolutes, boolean[] signs){
        int result = 0;
        for(int i =0; i<absolutes.length;i++){
            int num = absolutes[i];
            if(signs[i] == false){
                result -= num;
            }else {
                result += num;
            }
        }
        return result;
    }
}
