package ExceptionDemo;

//Creating a file through program

import java.io.File;
import java.io.IOException;

public class Checked {
    public static void main(String[] args) {
        File f = new File("D:\\Kiruthiga.APP\\Test");
        //  f.createNewFile();   -->    Checked Exception (IO Exception) - Compiler aware exception

        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File Created...");
    }
}
