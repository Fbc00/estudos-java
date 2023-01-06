public class Construtores {
    String name;
    Integer id;
    double algo;
    public  Construtores(String name, Integer id) {
        this.id = id;
        this.name = name;
    }
    public  Construtores(String name, Integer id, Double algo) {
        this.id = id;
        this.name = name;
        this.algo = algo;
    }
}
