package eg01;

/**
 * 测试不同数据类型最大值和最小值
 */
public class Scope {
    public static void main(String[] args) {
        //测试整型 byte short int long
        byte bMax=Byte.MAX_VALUE;
        byte bMain=Byte.MIN_VALUE;
        System.out.println("byte数据类型最大数值和最小值:"+bMax+","+bMain);
        short sMax=Short.MAX_VALUE;
        short sMain=Short.MIN_VALUE;
        System.out.println("short数据类型最大数值和最小值:"+sMax+","+sMain);
        int iMax=Integer.MAX_VALUE;
        int iMain=Integer.MIN_VALUE;
        System.out.println("int数据类型最大数值和最小值:"+iMax+","+iMain);
        long lMax=Long.MAX_VALUE;
        long lMain=Long.MIN_VALUE;
        System.out.println("long数据类型最大数值和最小值:"+lMax+","+lMain);
        //浮点型 float double
        float fMax=Float.MAX_VALUE;
        float fMain=Float.MIN_VALUE;
        System.out.println("float数据类型最大数值和最小值:"+fMax+","+fMain);
        double dMax=Double.MAX_VALUE;
        double dMain=Double.MIN_VALUE;
        System.out.println("double数据类型最大数值和最小值:"+dMax+","+dMain);
    }
}
