package Day_3;

public class RevWrds_InString {
    public static void main(String[] args) {
        String str = "I AM LEARNING JAVA";
        String[] wrd = str.split(" ");
        for(int i=0; i<wrd.length; i++)
        {
            for(int j=wrd[i].length()-1; j>=0; j--)
            {
                System.out.print(wrd[i].charAt(j)+" ");
            }
            System.out.print(" ");
        }
    }
}
