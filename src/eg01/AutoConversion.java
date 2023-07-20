package eg01;

/**
 * 自动类型转换
 */
public class AutoConversion {
    public static void main(String[] args) {
        byte b=100;
        int i=b;
        long l=i;
        float f=l;
        double d =f;

        double x=5+5.0;//5自动转换为double类型计算
    }
}
