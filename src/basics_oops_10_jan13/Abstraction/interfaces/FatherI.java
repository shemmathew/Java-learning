package src.basics_oops_10_jan13.Abstraction.interfaces;

interface FatherI {
    void load1K();

    default void print(){
        System.out.println("I am default method");
    }

    static void print2(){
        System.out.println("I am static METHOd!");
    }
}
