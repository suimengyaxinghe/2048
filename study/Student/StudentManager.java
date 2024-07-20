package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合，用于存储学生数据
        ArrayList array = new ArrayList<Student>();
        while (true) {
            System.out.println("----------欢迎来到学生管理系统------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择；");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    addStudent(array);
                    //添加学生的方法
                    break;
                case 2:
                    removeStudent(array);
                    //删除学生的方法
                    break;
                case 3:

                    updateStudent(array);
                    //修改学生的方法
                    break;
                case 4:
                    findAllStudent(array);
                    //查看所有学生的方法
                    break;
                case 5:
                    System.out.println("感谢您的使用");
                    System.exit(0);
            }
        }
    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号");
        String sid = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                System.out.println("请输入新名字");
                String name = sc.nextLine();
                System.out.println("请输入新年龄");
                String age = sc.nextLine();
                System.out.println("请输入新地址");
                String adrress = sc.nextLine();
                s.setName(name);
                s.setAge(age);
                s.setAddress(adrress);
                break;
            }
        }
    }

    public static void removeStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要删除的学生的学号");
        String sid = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
            System.out.println("已成功删除");
        }
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("系统中尚且没有学生信息，请先添加");
            return;
        }
        System.out.println("学号\t\t\t\t姓名\t\t年龄\t\t住址");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        String sid;
        //输入学生信息
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的学号");
            sid = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已存在");
            } else {
                break;
            }
        }
        System.out.println("请输入学生的名字");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生的地址");
        String address = sc.nextLine();
        //创建学生对象,并把输入数据传递给对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //将该学生添加到集合中
        array.add(s);
        //给予提示信息
        System.out.println("学生添加成功");
    }
}
