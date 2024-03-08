import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Challenge7 extends Challenge0{
    @Override
    public void run(List<Integer> numeros) {
        super.run(numeros);

        // Dar sort inverso, criar lista invertida
        // skippa primeiro valor,

        System.out.println(
                numeros.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(null)  // o print da 9, sem o orElse fica optional[9]
        );
    }
}
