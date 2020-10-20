public class Test {
    public static void main (String[] args){
        Teacher tea1 = new Teacher(12,"刘继兴","男","JAVA");
        Teacher tea2 = new Teacher(24,"曹亚米","女","德语");
        Student stu1 = new Student(32,"沈柳浩","男");
        Student stu2 = new Student(16,"赵丽蓓","女");
        Course cou1 = new Course(1,"JAVA","教215","周一123节");
        Course cou2 = new Course(2,"德语","教108","周二567节");
        cou1.setTeacher(tea1.name);
        cou2.setTeacher(tea2.name);
        System.out.println("教师：");
        System.out.println(tea1);
        System.out.println(tea2);
        System.out.println("学生：");
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println("选课：");
        stu1.choose(cou1.name,stu2.name);
        stu2.choose(cou2.name,stu1.name);
        System.out.println(cou1);
        System.out.println(cou2);
        System.out.println("退课：");
        stu1.drop("a","b");
        System.out.println(stu1);
    }
}
