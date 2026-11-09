package ExceptionDemo;

public class UnChecked {
    public static void main(String[] args) {
        System.out.println("Program Execution Started...");
        System.out.println(10/0);            //Unchecked Exception --> (Arithmetic Exception)  -  Compiler unaware exception
        System.out.println("Program Execution Completed...");
    }
}
