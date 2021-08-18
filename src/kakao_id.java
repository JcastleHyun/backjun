public class kakao_id {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        solution(new_id);
    }
    public static void solution(String new_id){
        String result = new_id;
        result = result.toLowerCase();
        result = result.replaceAll("\\p{Punct}", "");
//        result = result.replaceAll("..", "");
//        result = result.replaceAll("...", "");
//        if(result.charAt(0) == '.'){
//            result = result.substring(0);
//        }
        System.out.println(result);
    }
}
