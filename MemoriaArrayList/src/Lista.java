import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public void listinha () {
        List<String> list = new ArrayList<>();
        list.add("amor");
        list.add("fabricio");
        list.add(1, "ana");

//        list.removeIf(e -> e.charAt(0) == 'a');
        List<String> newLista = list.stream().filter(e -> e.charAt(0) == 'a').collect(Collectors.toList());
        List<Integer> algo = new ArrayList<>();

    }
}
