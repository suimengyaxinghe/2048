package TeacherAndStudent;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("钱莎莎");
        t.setAge("30");
        System.out.println(t.getName()+","+t.getAge());
        t.teach();
    }
}
