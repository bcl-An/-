public class Student extends Person{
    String xk;
    Course cou;

    Student(int num,String na,String s){
        super(num,na,s);
    }

    void setXk(String xk){
        this.xk = xk;
    }

    void choose(String k,String x){
        cou.setStudent(x);
        setXk(k);
    }

    void drop(String a,String b){
        cou.setStudent("无");
        System.out.println("姓名："+a+"已退课程："+b);
    }
}
