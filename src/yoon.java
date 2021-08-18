public class yoon {
    public static void main(String[] args) {

        System.out.println(solution(3,5));
    }
    public static long solution(int a, int b){
        long result = 0;
        int max = (a>b ? a : b);
        int min = (a>b ? b : a);
        for(int i = min; min<=max ; i++){
            System.out.println(i);
            result += i;

        }
        return result;
    }
}
