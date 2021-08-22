public class subac {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static String solution(int n){
        StringBuilder result_build = new StringBuilder();
        for(int i = 0; i <n; i++){
            if(i%2 == 0)
                result_build.append("수");
            else
                result_build.append("박");
        }
        return result_build.toString();
    }
}
