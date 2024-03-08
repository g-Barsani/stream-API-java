import java.util.List;

public class Challenge6 extends Challenge0 {

    @Override
    public void run (List<Integer> numeros) {

//        Desafio 6 - Verificar se a lista contém algum número maior que 10:

        System.out.println(numeros.stream().anyMatch(n -> n>10));

    }

}
