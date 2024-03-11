package src.basics_03_16dec;

public class Lab020 {
    public static void main(String[] args) {
        //Relational Operators == ,<= ,>= , !=

        int age_a=34;
        int age_b=31;

        boolean result= age_a<age_b;
        System.out.println(result);

        boolean result1 = (age_a <= age_b); //OR condition

        // For integers, it would check for value , but for String, it would check for reference
        System.out.println(result1);

        boolean result2 = (age_a >= age_b); //OR condition
        System.out.println(result2);

        boolean result3 = (age_a == age_b);
        System.out.println(result3);

        boolean result4 = (age_a != age_b); //not equal to
        System.out.println(result4);

    }
}
