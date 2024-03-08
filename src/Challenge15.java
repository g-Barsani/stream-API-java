import java.util.List;

public class Challenge15 extends Challenge0 {
//    Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
//    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.


    @Override
    public void run(List<Integer> numeros) {

        List<Integer> negativeNumbers = numeros.stream().filter(n -> n < 0).toList();
        System.out.println(negativeNumbers.stream().findFirst().orElse(null));

    }
}
