import java.util.List;

public class Challenge5 extends Challenge0 {
    @Override
    public void run(List<Integer> numeros) {

//        Desafio 5 - Calcule a média dos números maiores que 5:
//
//        Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

        List<Integer> higherThanFive = numeros.stream().filter(n -> n > 5).toList();

        long sumOfNumbersHigherThanFive = higherThanFive.stream().reduce(0, Integer::sum);

        long countOfNumbersHigherThanFive = higherThanFive.stream().count();

        System.out.println(sumOfNumbersHigherThanFive / countOfNumbersHigherThanFive);


    }
}
