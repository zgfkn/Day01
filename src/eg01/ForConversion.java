package eg01;

/**
 * 强制转换:范围大到小的转换
 * 溢出和精度丢失
 */
public class ForConversion {
    public static void main(String[] args) {
        int i1=120;
        byte b1=(byte) i1;//范围内数据可以转换成功

        int i2=256;
        byte b2=(byte) i2;//超出有效范围,会出现溢出
        System.out.println(b2);

        double d1=5.8;
        long l1=(long) d1;//精度损失(只保留整数部分)
        System.out.println(l1);
    }
}
