package src.basics_03_16dec;

public class Lab032 {
    //Object area is same as Heap area

    public static void main(String[] args) {
        String name = "The Testing Academy"; //SCP
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name1 = new String("The Testing Academy"); //OA=HEAP Area

    }
}
