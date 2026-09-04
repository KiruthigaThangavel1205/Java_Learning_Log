package Day_1;
import java.util.*;
public class CheckSingleValueData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean check = true;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ' || ch == ',')
                check = false;
        }
        if(check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
