package eg01;

/**
 * 字面量
 */
public class Literal {
    public static void main(String[] args) {
        int a=3;//int类型
        long b=5L;//long类型要+L/l,否者视为int类型
        short c=6;//一般情况下byte和short类型自动转换为int类型
        double d=5.5;//double类型(小数默认为double)
        float e=1.2F;//float类型+F/f
        char f='a';//char类型
        String g="a";//string类型
    }
}
