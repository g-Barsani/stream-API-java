import java.util.List;

public class Challenge12 extends Challenge0 {

//    Desafio 12 - Encontre o produto de todos os números da lista:
//
//    Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.


    @Override
    public void run(List<Integer> numeros) {


        System.out.println(numeros.stream().reduce(1, (a, b) -> a * b));
    }
}
