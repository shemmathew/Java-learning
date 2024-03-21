package src.basics_oops_09_jan7.Inheritance;

public class Lab144 {
    public static void main(String[] args) {

        BankAccount sbi_ref = new BankAccount();
        sbi_ref.printDetails();

        System.out.println(" ----  ---- ");

        BankAccount hdfc_ref = new BankAccount("HDFC","hdfc002");
        hdfc_ref.printDetails();

        System.out.println(" ----  ---- ");


        BankAccount icici_ref = new BankAccount("ICIC","icici003");
        icici_ref.bankCode = "icici005";
        icici_ref.printDetails();


        BankAccount yesbank_ref = new BankAccount("YES bANK","YES005");
        yesbank_ref.printDetails();



    }
}

//Every parametrized constructor has it's own attributes.
/*
Constructors are used to initialize the instance variables.*/
