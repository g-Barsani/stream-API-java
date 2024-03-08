import java.util.List;

public class Challenge18 extends Challenge0 {
    @Override
    public void run(List<Integer> numeros) {
//        Desafio 18 - Verifique se todos os números da lista são iguais:
//        Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
        System.out.println(numeros.stream().distinct().skip(1).findFirst().isEmpty());
    }
}
