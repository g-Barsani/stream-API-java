    import java.util.Arrays;
    import java.util.List;

    public class Challenge1 {



        public void run (List<Integer> numeros) {


            numeros.stream().sorted().forEach(System.out::println);

        }


    }
