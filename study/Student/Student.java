package Student;

import java.security.PrivateKey;

public class Student {
    //学生学号
    private String sid;
    //学生姓名
    private String name;
    //学生年龄
    private String age;
    //学生地址
    private String address;
    public Student(){

    }
    public Student(String sid,String name,String age,String address){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setSid(String sid){this.sid = sid;}

    public String getSid() {
        return sid;
    }
    public void setName(String name){this.name = name;}
    public String getName(){
        return name;
    }
    public void setAge(String age){this.age = age;}
    public String getAge(){
        return age;
    }
    public void setAddress(String address){this.address = address;}
    public String getAddress(){
        return address;
    }
}
