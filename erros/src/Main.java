import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        TryCatch tc = new TryCatch();
//        tc.program();

        FileWriter fil2 = new FileWriter("./teste.txt");
        File file = new File("./teste.txt");
        for(int i = 0; i < 10; i++) {
            fil2.write("" + i + "");

        }
        fil2.close();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}