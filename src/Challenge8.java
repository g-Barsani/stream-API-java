import java.util.List;

public class Challenge8 extends Challenge0{

    @Override
    public void run (List<Integer> numeros) {

//        Desafio 8 - Somar os dígitos de todos os números da lista:
//        Utilizando a Stream API, realize a soma dos dígitos de todos os
//        números da lista e exiba o resultado no console.

        Integer sumCha  = numeros.stream()
                .flatMapToInt(num -> String.valueOf(num).chars()) // Convert each number to char
                .map(Character::getNumericValue) // get the numeric value of the characters
                .sum(); // sum all the values
        System.out.println(sumCha);


    }
}
