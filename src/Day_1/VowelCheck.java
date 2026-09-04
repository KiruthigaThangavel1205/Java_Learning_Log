package Day_1;
import java.util.*;
public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = Character.toLowerCase(sc.nextLine().charAt(0));
        switch(ch)
        {
            case 'a': {
                System.out.println("Vowel");
                break;
            }
            case 'e': {
                System.out.println("Vowel");
                break;
            }
            case 'i': {
                System.out.println("Vowel");
                break;
            }
            case 'o': {
                System.out.println("Vowel");
                break;
            }
            case 'u': {
                System.out.println("Vowel");
                break;
            }
            default:{
                System.out.println("Invalid...");
            }
        }
    }
}
