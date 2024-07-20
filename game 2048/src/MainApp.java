import java.util.*;

public class MainApp {
    CheckBoard[][] board;
    static int score;
    Random random = new Random();
    static boolean isOver = false;
    static int SIDE_LENGTH = 4;
    int size;

    public enum GameState {
        START, PAUSE, END
    }

    private GameState currentState;


    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.initBoard(SIDE_LENGTH);
        mainApp.randomOneCheckBoard();
        mainApp.randomOneCheckBoard();
        System.out.println("游戏开始");
        System.out.println("当前得分为：" + mainApp.score);
        System.out.println(mainApp);//创建初始界面，模拟游戏开始时有两个数字的状态
        while (!mainApp.isOver) {
            Scanner scanner = new Scanner(System.in);
            String key = scanner.next();
            buildLinked(mainApp.board, key);
            mainApp.randomOneCheckBoard();
            System.out.println("当前得分为：" + mainApp.score);
            System.out.println(mainApp);
        }


    }

    //wasd控制方向
    static void buildLinked(CheckBoard[][] board, String direction) {
        cleanLink(board);
        switch (direction) {
            case "a":
                for (int i = 0; i < SIDE_LENGTH; i++) {
                    for (int j = 0; j < SIDE_LENGTH - 1; j++) {
                        board[i][j].setNext(board[i][j + 1]);
                    }

                    board[i][0].merge();
                }
                break;
            case "d":
                for (int i = 0; i < SIDE_LENGTH; i++) {
                    for (int j = 0; j < SIDE_LENGTH - 1; j++) {
                        board[i][j + 1].setNext(board[i][j]);
                    }
                    board[i][SIDE_LENGTH - 1].merge();
                }
                break;
            case "w":
                for (int i = 0; i < SIDE_LENGTH; i++) {
                    for (int j = 0; j < SIDE_LENGTH - 1; j++) {
                        board[j][i].setNext(board[j + 1][i]);
                    }
                    board[0][i].merge();
                }
                break;
            case "s":
                for (int i = 0; i < SIDE_LENGTH; i++) {
                    for (int j = 0; j < SIDE_LENGTH - 1; j++) {
                        board[j + 1][i].setNext(board[j][i]);
                    }
                    board[SIDE_LENGTH - 1][i].merge();
                }
                break;
            case"over":
                isOver = true;
        }
    }

    static void cleanLink(CheckBoard[][] board) {
        for (int i = 0; i < SIDE_LENGTH; i++) {
            for (int j = 0; j < SIDE_LENGTH; j++) {
                board[i][j].setNext(null);
            }

        }
    }

    //用于创建二维棋盘
    void initBoard(int size) {
        board = new CheckBoard[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new CheckBoard(0);
            }
        }
    }

    //重写了toSring方法，用于创建棋盘
    @Override
    public String toString() {
        String text = "";
        for (CheckBoard[] row : board) {
            for (CheckBoard checkBoard : row) {
                text += checkBoard.toString();
                text += "\t";
            }
            text += "\n";
        }
        return text;
    }

    //用于一次随机赋值2或4
    public void randomOneCheckBoard() {
        List<CheckBoard> flat = new ArrayList<>();
        for (CheckBoard[] row : board) {
            for (CheckBoard checkBoard : row) {
                if (checkBoard.id == 0) {
                    flat.add(checkBoard);
                }
            }
        }

        //没有空间了，游戏结束
        if (flat.isEmpty()) {
            if (!canMerge()) {
                this.over();
            }
        } else {
            int[] list1 = {2, 4};
            int index = random.nextInt(list1.length);
            CheckBoard checkBoard1 = flat.get(random.nextInt(flat.size()));
            checkBoard1.setId((list1[index]));
        }



        /*int[] list1 = {2, 4};
        int index = random.nextInt(list1.length);
        CheckBoard checkBoard = flat.get(random.nextInt(flat.size()));
        checkBoard.setId(list1[index]);

        return checkBoard;*/
    }

    public void over() {
        System.out.println("游戏结束");
        isOver = true;
    }

    public void startGame() {
        if (currentState == GameState.START || currentState == GameState.END) {
            // 初始化游戏数据
            // ...
            currentState = GameState.START;
            System.out.println("Game started!");
        }
    }

    public boolean canMerge() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (board[i][j].equals(board[i][j + 1]) || board[i][j].equals(board[i + 1][j])) {
                    return true;
                }

            }
        }

        return false;
    }
}