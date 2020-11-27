package homework22.task2;

import java.util.stream.Stream;

public class CoinMain {
    public static void main(String[] args) {
        int x = 10 + (int) (Math.random() * 41);
        Stream<Integer> stream = Stream.of(x);
        Stream<Integer> stream1 = Stream.of(x);
        stream.filter(f -> f < 20).forEach(f -> System.out.println("Випав Avers, " + "X = " + f));
        stream1.filter(f -> f >= 20).forEach(f -> System.out.println("Випав Revers, " + "X = " + f));
    }
}

