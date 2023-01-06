public class MembrosEstaticos {
    public static final double PI = 3.14159; // final garanta que o valor seja constante
    public static double calculaCircunferencia(double raio){
        return 2 * PI * raio;
    }

    public static double calculaVolume(double raio) {
        return 4.0 * PI * Math.pow(raio, 3.0) / 3.0;
    }
    
}
