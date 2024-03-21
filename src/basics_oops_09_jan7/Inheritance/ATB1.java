package src.basics_oops_09_jan7.Inheritance;

public class ATB1 {
    public static void main(String[] args) {
        ATB s1=new ATB();
        s1.printdetails();
        System.out.println(s1.name);
        String g= s1.name;
        System.out.println(g);
        g="Mathew";
        System.out.println(g);

    }
}
