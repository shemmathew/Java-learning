package src.basics_oops_09_jan7.Inheritance.Multilevel;

public class Lab148 {
    public static void main(String[] args) {
//        GrandFather g = new GrandFather(); possible
//        Father f = new Father();  possible
//        Son s = new Son(); possible
//
//
//        GrandFather g = new Son(); possible
//
//
//        Father f = new Son(); possible
//        // Son s  = new GrandFather(); impossible
//        // Son s = new Father(); impossible
//        Son s = new Son(); possible

        GrandFather g = new Son();
        g.bhk3();

        Son s = new Son();
        s.bhk1();
        s.bhk2();
        s.bhk3();



    }
}
