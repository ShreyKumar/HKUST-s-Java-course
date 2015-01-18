import java.io.*;
import java.util.Scanner;
import comp102x.IO;

public class ScannerForConsole {

     public void readNamesFromConsole() throws IOException {
        // 1. Create a Scanner object for standard input
        Scanner input = new Scanner(System.in);
        int nStudents = 0;
        // 2. read the content from standard input using a loop
        while (true) {  
              String inputName = input.nextLine();  

              if (inputName.equals("")) break;
              
              IO.outputln("Student #" + nStudents + ": " + inputName);                           
              nStudents++;
        }    
     }
}