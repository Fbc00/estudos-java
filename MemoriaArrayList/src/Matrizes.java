import jdk.jshell.Snippet;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

    public static void eita () {
        Locale.setDefault(Locale.US);
        System.out.println("digite o valor da matriz: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matriz[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();
                matriz[i][j] = value;
            }
        }

        for (int i=0; i<n; i++) {
            System.out.println(matriz[i][i]);

        }
        sc.close();
    }
}
