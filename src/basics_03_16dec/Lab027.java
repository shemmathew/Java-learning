package src.basics_03_16dec;

public class Lab027 {
    public static void main(String[] args) {

        // Casting - Mold
        //  Widening casting(automatic) is the process of converting lower datatype to higher datatype. This is safe conversion. it has both implicit and explicit
          // wideningIn this case the casting/conversion is done automatically therefore, it is known as implicit type casting. In this case both
        // datatypes should be compatible with each other.
        // byte -> short -> char -> int -> long -> float -> double

        byte b = 10;
//        int a =  b; // Implicit Casting -  it is done by JVM-- int > byte (here b(byte) value is stored/changed  to a(int))
        int a = (int) b; // Explicit Casting - JVM---here int is greyed out--we specify int(higher type) as (int)


        // Narrowing casting (manually) is the process of converting higher type to lower type. it has both implicit and explicit narrowing
        int a1 = 300;
        // byte b1 = a1; // Invalid (int value cannot store in byte)- Implicit Casting is not allowed by JVM here
        byte b1 = (byte)a1; // EXPLICIT casting --here byte portion of a1(impossible to store int portion) is stored in b1
        System.out.println(b1);//---44


        // 32 Bits (for 300) are stored like this---for integer--only last portion will be stored==here memory management is happening by JVM
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
        // 8 bits will be stored into the b1 (line 17)
        // 0 0 1 0 1 1 0 0
//        0 * 27 + 0 * 26 + 1 * 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20
//        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44
        //44

//USE bigger bucket data type, otherwise will loose data/value.In wideninig, implicit and explicit are happening.But in narrowing only explicit
// casting is only possible

    }
}

