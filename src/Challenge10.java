import java.util.List;

public class Challenge10 extends Challenge0{

    @Override
    public void run (List<Integer> numeros) {

//        Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//        Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

         List<Integer> numerosDivisiveis3ou5 = numeros.stream().filter(n -> n % 5 == 0 || n % 3 ==0 ).toList();
        System.out.println(numerosDivisiveis3ou5.stream().filter(n -> n % 2 != 0).toList());




    }
}
