import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge2 {


    public void run (List<Integer> numeros) {
        List<Integer>numerosSomados = numeros.stream().filter(n -> n % 2 == 0).toList();
        Integer resultado = numerosSomados.stream().reduce(0, Integer::sum);
        System.out.println(resultado);
//        numerosSomados.forEach(System.out::println);

    }



}
