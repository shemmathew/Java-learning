package src.basics_01;

public class Lab001 {
    public static void main(String[] args) {
        byte age =10;
        System.out.println(age); //prints 10

        age = 127; //prints
        System.out.println(age); //prints 127
        System.out.println(age+1); //prints 128 (not storing)

        // age = (age+1); //gets error message as incompatible types: possible lossy conversion from int to byte
        /* Here byte cannot store 128. A lossy data conversion method is one where converting data between one storage format and another displays data
        in a form that is "close enough" to be useful, but may differ in some ways from the original. This type of conversion
        is used frequently between software packages that rely on different storage techniques.*/

        System.out.println(age); //prints 127

       // short age = 128; //cannot use the same variable name for different data types in the method main()

    }
}
