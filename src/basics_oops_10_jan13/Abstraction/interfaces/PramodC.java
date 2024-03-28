package src.basics_oops_10_jan13.Abstraction.interfaces;

public class PramodC implements FatherI{
    @Override
    public void load1K() {
        FatherI.print2();
        System.out.println("I will give you LOAN!");
    }
}
