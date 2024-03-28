package src.basics_oops_10_jan13.Abstraction;

public abstract class Animal {
    Animal(){}

    void m1(){ // Concrete Method , Complete
        System.out.println("I am m1()");
    }
    abstract void m2(); // Not completed, Someone will do?

}
