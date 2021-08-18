public class lackmoney {
    public static long solution(int price, int money, int count){
        long result = money(price,count);
        if(result>money)
            result = result-money;
        else {
            result = 0;
        }
        return result;
    }
    public static long money(int price, int count){
        long result = 0;
        for(int i =0; i<count ;i++){
            result += price*(i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        long result = solution(3,3,1);
        System.out.println(result);
    }
}
