import java.util.HashMap;
import java.util.Map;

public class Product {
    String name;
    int quantity;
    double price;

    public  Product (String name, Integer price )  {
        this.price = price;
        this.name = name;
    }
    public double toalValueIntStock() {
        return  this.quantity * price;
    }

    public  void addProduto(int quantidade) {
        this.quantity += quantidade;
    }
    public  void removeProduto(int quantidade) {
        this.quantity -= quantidade;
        this.toString();
    }


    public Map to_dict_json () {
        Map map = new HashMap();
        map.put("name", name);
        map.put("price", price);
        map.put("quantity", quantity);

        return map;
    }
}
