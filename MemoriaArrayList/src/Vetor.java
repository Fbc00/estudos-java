
import java.util.Locale;
import java.util.Scanner;


public class Vetor {


    public  void algo () {
        Locale.setDefault(Locale.US);
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            double aux = sca.nextDouble();
            vect[i] = aux;

        }

        sca.close();

    }

}
