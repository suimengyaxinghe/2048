
public class CheckBoard {
    public boolean isBlank;
    int id;
    CheckBoard next;
    static int score = 0;

    public CheckBoard getNext() {
        return next;
    }

    public void setNext(CheckBoard next) {
        this.next = next;
    }

    public void setId(int id) {
        this.id = id;
    }


    public CheckBoard(int id) {
        this.id = id;
    }

    void compress() {
        if (next == null) return;
        if (next.id == 0) next.compress();


        if (this.id == 0 && next.id > 0) {
            this.id = next.id;
            next.id = 0;
            next.compress();
        }
    }

    void merge() {
        if (next == null) return;
        this.compress();


        if (this.id == next.id && this.id > 0) {
            boardcastScore((this.id));
            this.id = this.id * 2;
            next.id = 0;
        }
        next.merge();
    }

    void boardcastScore(int score){
        MainApp.score += score*2;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }


    public void init() {
        this.id = 2;
    }

    public boolean isBlank() {
        return this.id == 0;
    }
}