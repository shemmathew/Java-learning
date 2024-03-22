package src.basics_oops_09_jan7.Inheritance.Hierarchial;

public class Vehicle {

    Vehicle(){
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed(){
        System.out.println("Yeah from "+getClass().getSimpleName()); //displays class name
    }
}
