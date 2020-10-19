public class Person {
    int number;
    String name,sex;
    Person(int num, String na, String s){
        number = num;
        name =na;
        if (s.equals("男")||s.equals("女")) {
            sex = s;
        }
    }
}
