public class Course {
    int number;
    String name,place,time,teacher;

    public String toString(){
        return number+" "+name+" "+place+" "+time+" "+teacher;
    }

    Course(int num,String na,String pla,String ti,String te){
        number = num;
        name = na;
        place = pla;
        time = ti;
        teacher = te;
    }
}
