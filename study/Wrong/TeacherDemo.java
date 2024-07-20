package Wrong;

import java.util.Scanner;

public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        Teacher t = new Teacher();
        t.chekcScore(score);
        /*
        try {
            t.chekcScore(score);
        } catch (ScoreException e) {
            throw new RuntimeException(e);
        }
         */
    }
}
