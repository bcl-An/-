public class Person {
    int number;
    String name,sex;

    public String toString(){
        return "编号："+number+" 姓名："+name+" 性别："+sex;
    }

    Person(int num, String na, String s){
        number = num;
        name =na;
        if (s.equals("男")||s.equals("女")) {
            sex = s;
        }
    }
}
