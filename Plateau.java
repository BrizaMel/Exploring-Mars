import java.util.HashSet;

public class Plateau {
    private int row;
    private int col;
    private HashSet<String> plateau = new HashSet<>();

    public Plateau(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Boolean positionAllowed(int x, int y) {
        Boolean rowInBounds = x >= 0 && x <= this.row;
        Boolean colInBounds = y >= 0 && y <= this.col;
        if (rowInBounds || colInBounds) {
            System.out.println("Position (" + x + "," + y + ") is out of bounds");
            return false;
        }

        // check the avaliability of the new position (x, y)
        String newPos = Integer.toString(x) + ',' + Integer.toString(y);
        if (this.plateau.contains(newPos)) {
            System.out.println("Position (" + x + "," + y + ") is already ocuppied");
            return false;
        }
        
        return true;
    }
}