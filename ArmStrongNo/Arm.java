public class Arm {
    public static boolean digitCount(int num){
        int sum = 0;
        int original = num;
        int digit;
        while(num>0){
            digit = num%10;
            sum = sum+digit*digit*digit;
            num = num/10;
        }
        return sum == original;
        
    }
}
