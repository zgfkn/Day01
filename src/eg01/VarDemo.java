package eg01;

public class VarDemo {
    //程序入口
    public static void main(String[] args) {
        //声明一个变量 类型+变量名
        /**
         * 变量命名规则
         * 可以有数字,但数字不能开头
         * 不能有关键字
         * 不能有除_和$的特殊符号
         */
        int v1=10;//声明一个int变量 变量名是v1 初始值=10
        System.out.println("v1="+v1);
        int v2;
        v2=10;//使用前赋值
        System.out.println("v2="+v2);
        int v3=10;
        System.out.println("v3="+v3);
        v3=20;//修改变量
        System.out.println("v3="+v3);
        /**
         * 基本数据类型
         * 整数型 byte(-2^7~2^7-1) short(-2^15~2^15-1) int(-2^31~2^31-1) long(-2^63~2^63-1)
         * 浮点型 float double
         * 布尔型 boolean
         * 字符串型 char
         */
    }
}