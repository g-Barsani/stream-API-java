import java.util.List;

public class Challenge16 extends Challenge0{
//    Desafio 16 - Agrupe os números em pares e ímpares:
//    Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.

    @Override
    public void run(List<Integer> numeros) {
        List<Integer>evenNumbers = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer>oddNumbers = numeros.stream().filter(n -> n % 2 != 0).toList();

        System.out.println("Even numbers" + evenNumbers);
        System.out.println("Odd numbers" + oddNumbers);
    }


}
