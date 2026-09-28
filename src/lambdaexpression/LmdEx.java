package lambdaexpression;

public class LmdEx {
    @FunctionalInterface
    interface MyFunctionalInterface {
        int operation(int a, int b);
    }

    public static void main(String[] args) {

        //Runnable Interface implementation using lambda expression
        Runnable r = () -> System.out.println("Runnable interface implemented using lambda expression");
        new Thread(r).start();

        // Lambda expression to implement a functional interface
        MyFunctionalInterface myFunc = (a, b) -> a + b;
        MyFunctionalInterface myFunc2 = (a,b) -> a - b;
        int result = myFunc.operation(5, 10);
        int result2 = myFunc2.operation(10, 5);
        System.out.println("Result: " + result);
        System.out.println("Result2: " + result2);
    }
}
