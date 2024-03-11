package src.basics_02;

public class Lab009 {
    public static void main(String[] args) {
        byte b=10;
        int s=128;
        short r=1000;
        short y=1000; //can have same value, but not same variable name

        y=2000;
        y=67;
        y=4;
        System.out.println(y); //prints y=4 ---value is being updated
    }
}
