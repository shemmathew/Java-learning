package src.basics_oops_10_jan13.AccessModifiers.police;

public class JrCop {

    public static void main(String[] args) {

        Cop jrcop = new Cop(2);
        System.out.println(jrcop.gun);
        jrcop.canIShoot();
    }
}
