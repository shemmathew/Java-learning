package src.basics_oops_11_jan14.innerclass;

public class Lab157 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am THREAD!!");
            }
        };



    }
}
