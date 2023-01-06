package abstrato;



public abstract class Item {
    Color color;

    public Item (Color  color) {
        this.color = color;
    }

    public abstract Double area ();
}
