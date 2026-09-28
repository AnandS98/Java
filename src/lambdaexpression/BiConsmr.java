package lambdaexpression;

import java.util.function.BiConsumer;

public class BiConsmr {
    public static void main(String[] args){
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println("Sum: " + (a + b));
        biConsumer.accept(5, 10);
    }
}
