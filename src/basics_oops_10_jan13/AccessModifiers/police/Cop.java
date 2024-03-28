package src.basics_oops_10_jan13.AccessModifiers.police;

public class Cop {
    public int gun;
    // modifier return name_variable

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Of-course, Shoot");
    }



}
