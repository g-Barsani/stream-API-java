import java.util.List;

public class Challenge17 extends Challenge0 {
//    Desafio 17 - Filtrar os números primos da lista:
//    Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.


    @Override
    public void run(List<Integer> numeros) {
        super.run(numeros);

        List<Integer> primeNumbers = numeros.stream().filter(Challenge17::isPrime).toList();
        primeNumbers.forEach(System.out::println);


    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
