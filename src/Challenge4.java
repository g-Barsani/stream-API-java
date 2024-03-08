import java.util.List;

public class Challenge4 {

    public void run (List<Integer> numeros) {
        List<Integer>listaSemImpares = numeros.stream().filter(n -> n % 2 == 0).toList();
        listaSemImpares.forEach(System.out::println);

    }
}
