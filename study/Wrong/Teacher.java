package Wrong;

public class Teacher {
    public void chekcScore(int score)/* throws ScoreException*/{
        if(score < 0 || score > 100){
            try {
                throw new Exception("你输入的分数有误");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("你输入的分数正确");
        }
    }
}
