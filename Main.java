import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = input.nextInt();
        int col = input.nextInt();
        
        while (input.hasNext()) {
            int x = input.nextInt();
            int y = input.nextInt();
            char dir = input.next().charAt(0);
            
            String trajetory = input.next();
            System.out.println(x);
            System.out.println(y);
            System.out.println(dir);
            System.out.println(trajetory);
        }

        input.close();
    }
}