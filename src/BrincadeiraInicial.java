import java.util.ArrayList;
import java.util.Locale;

public class BrincadeiraInicial {
    static void brinca() {
        int a = 1, c=2, d=5;
        Double b = 2.66, resultado;
        String fbc = "fbc";

        ArrayList<String> paresString = new ArrayList<String>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                paresString.add("" + i + "");
            }
            else {
                impares.add(i);
            }

        }
        for (double number: impares ) {
            Locale.setDefault(Locale.US);
            System.out.println(number);

        }

        System.out.printf("%s %d %.2f \n", fbc, a, b);
        resultado = (double) d/2;
        System.out.println(resultado);
        //        while(iteratorNumbers.hasNext()) {
//            System.out.println(iteratorNumbers.next());
//        }

    }
}
