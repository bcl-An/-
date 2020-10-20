public class Course {
    int number;
    String name,place,time,teacher,student;

    public String toString(){
        return "编号："+number+" 课程名称："+name+" 地点："+place+" 时间："+time+" 授课教师："+teacher+" 已选学生："+student;
    }

    Course(int num,String na,String pla,String ti){
        number = num;
        name = na;
        place = pla;
        time = ti;
    }

    void setTeacher(String te){
        teacher = te;
    }

    void choose(String x){
        student = x;
    }

    void drop(String a,String b){
        System.out.println("姓名："+a+" 已退课程："+b);
    }

}
