import java.util.List;

public class Challenge19 extends Challenge0 {
    @Override
    public void run(List<Integer> numeros) {
        super.run(numeros);

        List<Integer> numerosDivisiveis3ou5 = numeros.stream().filter(n -> n % 5 == 0 || n % 3 ==0 ).toList();
        numerosDivisiveis3ou5.forEach(System.out::println);


        System.out.println(numerosDivisiveis3ou5.stream().reduce(0, Integer::sum));
    }
}
