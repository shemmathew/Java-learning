package src.basics_03_16dec;

public class Lab023 {
    public static void main(String[] args) {

        // T || T -->TRUE
        // T || F -->TRUE
        // F || T -->TRUE
        // F || F -->FALSE

        System.out.println( true || true);
        System.out.println( true || false);
        System.out.println( false || true);
        System.out.println( false || false);

        // T && T -->TRUE
        // T && F -->FALSE
        // F && T -->FALSE
        // F && F -->FALSE

        System.out.println( true && true);
        System.out.println( true && false);
        System.out.println( false && true);
        System.out.println( false && false);

    }
}
