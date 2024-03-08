import java.util.List;

public class Challenge11 extends Challenge0 {

//    Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//
//    Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
// 435

    @Override
    public void run(List<Integer> numeros) {

//        itemList.stream_api()
//                .mapToDouble(item -> item.getPreco() * item.getQuant())
//                .sum();

        List<Integer> squaredNumbers = numeros.stream()
                .map(item -> item * item)
                .toList();

        System.out.println(squaredNumbers.stream().reduce(0, Integer::sum));

    }
}
