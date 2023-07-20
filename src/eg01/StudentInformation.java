package eg01;

/**
 * 存储学生信息
 */
public class StudentInformation {
    public static void main(String[] args) {
        //学生信息 驼峰标识:类名每个单词首字母大写,变量名第一个单词首字母小写,其他单词首字母大写
        int studentId = 12345;//学号
        String studentName = "张三";//姓名
        int age = 20;//年龄
        double score = 78.5;//成绩
        char gender = '男';
        boolean isMarried = true;
        //输出学生信息
        System.out.println("学生信息:");
        System.out.println("学号:" + studentId);
        System.out.println("姓名:" + studentName);
        System.out.println("年龄:" + age);
        System.out.println("性别:" + gender);
        System.out.println("婚否:" + isMarried);
        System.out.println("你好\n在吗?");//转义字符:\n(换行)\r(回车)\b(删除)\'(输出')\"(输出")\\(输出\)
        //System.out.print"ln"();自带换行功能
    }
}
