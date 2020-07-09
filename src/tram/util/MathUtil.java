
package tram.util;

/**
 *
 * @author yiyangqianxi
 */
//class chứa các hàm tiện ích hỗ trợ các phép tính toán
//do đó chúng mày sẽ là static
public class MathUtil {
    //hàm giai thừa n!= 1.2.3...n bùng nôt kết quả rất nhanh 
    //nên tràn int (2 tỉ 1) sớm, ta trrarvefe long cỡ 15! hoy
    public static long computerFactorial(int n){
        //cứ viết sai đúng từ từ tính!
        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
        
    }
    
}
