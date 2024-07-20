package TeacherAndStudent;

public class StudentDemo extends Person{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("叶国强");
        s.setAge("19");
        System.out.println(s.getName()+","+s.getAge());
        s.study();
    }
}
