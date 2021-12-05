public class Sonda {
    private int row;
    private int col;
    private char dir;

    public Sonda(int x, int y, char dir) {
        this.row = x;
        this.col = y;
        this.dir = dir;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public char getDirection() {
        return dir;
    }

    public void setRow(int x) {
        this.row = x;
    }

    public void setCol(int y) {
        this.col = y;
    }

    public void setDirection(char d) {
        this.dir = d;
    }

    public char newDirection(char d) {
        char c = this.dir;
        if (d == 'R') {
            if (this.dir == 'N') c = 'W';
            if (this.dir == 'W') c = 'S';
            if (this.dir == 'S') c = 'E';
            if (this.dir == 'E') c = 'N';
        }
        else {
            if (this.dir == 'N') c = 'E';
            if (this.dir == 'W') c = 'N';
            if (this.dir == 'S') c = 'W';
            if (this.dir == 'E') c = 'S';
        }
        
        return c;
    }
}