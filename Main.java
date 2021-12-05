import java.util.Scanner;

public class Main {
    
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
            
        }

        input.close();
    }
}