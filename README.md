# 学生选课模拟系统
### 计191 陈伟然 2019310172
# 实验三
## 实验目的
掌握类的继承用法，通过构造方法实例化对象；<br>
学会使用super()，用于实例化子类；<br>
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 要求
### 业务要求
#### 说明：
>>学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。<br>

#### 对象示例：
>>人员（编号、姓名、性别）<br>
>>教师（编号、姓名、性别、所授课程）<br>
>>学生（编号、姓名、性别、所选课程）<br>
>>课程（编号、课程名称、上课地点、时间、授课教师）<br>
### 实验要求
>>1.编写上述实体类以及测试主类（注意类之间继承关系的适用）<br>
>>2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师）；模拟学生退课操作，再打印课程信息。
## 过程
1、实例化各实体类，并赋值；<br>
2、输出教师、学生信息；<br>
3、执行选课过程，并输出结果；<br>
4、执行退课过程，并输出结果。<br>
## 流程图
![列表lct.png图片](https://github.com/bcl-An/course/blob/main/lct.png "流程图") 
## 核心代码
```JAVA
cou1.setTeacher(tea1.name);
cou2.setTeacher(tea2.name);//确定课程的授课教师

System.out.println("教师：");
System.out.println(tea1);
System.out.println(tea2);//输出教师列表

System.out.println("学生：");
System.out.println(stu1);
System.out.println(stu2);//输出学生列表

System.out.println("选课：");
cou1.choose(stu2.name);
stu2.setXk(cou1.name);
cou2.choose(stu1.name);
stu1.setXk(cou2.name);//选课过程

System.out.println(cou1);
System.out.println(cou2);//输出选课结果

System.out.println("退课：");
cou2.student = "无";
stu1.xk = "无";//退课过程

cou1.drop(stu1.name,cou2.name);
System.out.println(cou1);
System.out.println(cou2);//输出退课结果
```
## 运行截图
![列表yxjg.png图片](https://github.com/bcl-An/Course/blob/main/yxjg.png "运行结果") 
## 感想
这次对“模拟选课系统”的编写，加深了我对类与类的关系的认识。掌握对super关键字和toString方法的运用的同时，我也提高了对错误的鉴别能力，以及推翻重做的勇气。
