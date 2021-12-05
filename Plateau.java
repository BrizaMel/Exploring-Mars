import java.util.HashSet;

public class Plateau {
    private int row;
    private int col;
    private HashSet<String> plateau = new HashSet<>();

    public Plateau(int row, int col) {
        this.row = row;
        this.col = col;
    }
}