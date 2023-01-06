import java.util.Collections;
public class MatematicaJava {
    static void  seiLa(int a, int b, char simbol) {
        Double resultado;
        switch (simbol) {
            case '*':
                resultado = (double) a * b;
                System.out.println(resultado);
            case '+':
                resultado = (double) a + b;
                System.out.println(resultado);
        }

    }

    static void libMath() {
        double a, b, c, delta;
        a = Math.sqrt(2.0);
        b = Math.sqrt(3.0);
        c = Math.sqrt(5.0);
        System.out.printf("%.2f, %.2f, %.2f",  a, b, c);

        delta = Math.pow(b, 2.0) - 4*a*c;

        double x = (- b + delta) / 2*a;
        if( x < 0 ) {
            x = (- b - delta) / 2*a;
        }
        System.out.println("valor de x é: " + x);


    }
}
