import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public void program() {
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
           // e.printStackTrace();//printa o erro no console e continua a execução
            System.out.println("Invalid position!");


        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        
        sc.close();
    }
}
