import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Task1
       /* Scanner scanner = new Scanner(System.in);
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        System.out.println(birthday.plusYears(100));*/

        //Task2
        /*int [] array = new int [] {1,2,-3,4,-5,6,-7,8,9};
        Predicate<Integer> pr = (a) -> {
            for (int i = 0; i <array.length; i++) {
                if (array[i] > 0){
                    System.out.println(i);
                }
            }
            return true;
        };
        pr.test(1);*/

        //Task3
       /* String input = "524 BYN";
        Function<String, Double> fn = (line) -> {
            double value = (double) Integer.parseInt(line.replaceAll("[^0-9]",""));
            return  value / 3.11;
        };
        System.out.println(fn.apply(input));*/

        //Task4
        /*String input = "524 BYN";
        Consumer<String> cs = (line) -> {
            double value = (double) Integer.parseInt(line.replaceAll("[^0-9]",""));
            System.out.println(value / 3.11);
        };
        cs.accept(input);*/

        //Task5
        Supplier<String> sp = ()-> {
            Scanner scanner = new Scanner(System.in);
            StringBuilder stringBuilder = new StringBuilder();
            return  stringBuilder.append(scanner.nextLine()).reverse().toString();
        };
        System.out.println(sp.get());
    }
}