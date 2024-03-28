package src.basics_oops_10_jan13.AccessModifiers.criminal;
import src.basics_oops_10_jan13.AccessModifiers.police.Cop;
public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();
        //He is not in the Protect Police folder


    }
}
