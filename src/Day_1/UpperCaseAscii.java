package Day_1;
import java.util.*;
public class UpperCaseAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
//        int a = ch;
        if(ch>=65 && ch<=90)
            System.out.println((int)ch);
        else
            System.out.println("Not a upper case...");
    }
}
