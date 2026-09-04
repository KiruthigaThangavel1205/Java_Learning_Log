package Day_1;
import java.util.*;
public class FloatOrNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean check = false;
        for(int i=str.length()-1; i>=0; i--)
        {
            if(str.charAt(i) == '.')
                check = true;
        }
        if(check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}