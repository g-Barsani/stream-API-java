import java.util.List;

public class Challenge13 extends Challenge0{
//    Desafio 13 - Filtrar os números que estão dentro de um intervalo:
//    Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.


    @Override
    public void run(List<Integer> numeros) {
        super.run(numeros);

        numeros.stream().filter(n -> n > 5 && n < 10).forEach(System.out::println);
    }
}
