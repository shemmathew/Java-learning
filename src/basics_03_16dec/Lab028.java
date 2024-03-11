package src.basics_03_16dec;

public class Lab028 {

    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f; // Both data types represent numbers with decimals,
                            // but a float is 32 bits in size while a double is 64 bits.
        double total = course+ GST; //total cannot be int because of GST(FLOAT)  float<double---aim for bigger bucket.
                                    // if not we will lose data-JVM will notify this(eg : if float total, answer will be 100 instead of 118.45
                      // so go for double total
        System.out.println(total);


    }
}

