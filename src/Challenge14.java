import java.util.List;

public class Challenge14 extends Challenge0 {
    @Override
    public void run(List<Integer> numeros) {
        super.run(numeros);


//        Desafio 14 - Encontre o maior número primo da lista:
//
//        Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
          List<Integer> primeNumbers = numeros.stream()
                  .filter(Challenge14::isPrime).toList();
//        primeNumbers.forEach(System.out::println);

        System.out.println(primeNumbers.stream().max(Integer::compareTo).orElse(null));


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
