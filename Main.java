import java.util.Scanner;

public class Main {
    public static Boolean executeTrajetory(Plateau p, Sonda s, String trajetory) {
        int i = 0;
        while (i < trajetory.length()) {
            char c = trajetory.charAt(i);
            
            if (c == 'L' || c == 'R') s.setDirection(s.newDirection(c));

            else if (c == 'M') {
                int newRow = s.nextPosition()[0];
                int newCol = s.nextPosition()[1];

                if (!p.positionAllowed(newRow, newCol)) return false;
            
                p.setPosition(s, newRow, newCol);
                s.setRow(newRow);
                s.setCol(newCol);
            }

            else {
                System.out.println("Command not allowed!");
                return false;
            }
            
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = input.nextInt();
        int col = input.nextInt();
        Plateau plateau = new Plateau(row, col);
        
        while (input.hasNext()) {
            int x = input.nextInt();
            int y = input.nextInt();
            char dir = input.next().charAt(0);
            Sonda sonda = new Sonda(x, y, dir);

            String trajetory = input.next();
            if(executeTrajetory(plateau, sonda, trajetory)) {
                System.out.println(sonda.getRow() + " " + sonda.getCol() + " " + sonda.getDirection());
            }
            
        }

        input.close();
    }
}