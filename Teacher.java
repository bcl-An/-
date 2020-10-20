public class Teacher extends Person{
    String sk;

    public String toString(){
        return "编号："+number+" 姓名："+name+" 性别："+sex+" 教授课程："+sk;
    }

    Teacher(int num,String na,String s,String sk){
        super(num,na,s);
        this.sk = sk;
    }
}
