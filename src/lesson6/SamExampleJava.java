package lesson6;

/**
 * A SAM (single abstract method) is also called a Functional Interface.
 * - An Interface with a single method.
 */
public class SamExampleJava {
    public static void main(String[] args) {
        foo(() -> System.out.println("Java lambda!"));
    }

    public static void foo(Runnable runnable) {
        runnable.run();
    }
}
