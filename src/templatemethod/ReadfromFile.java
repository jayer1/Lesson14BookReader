package templatemethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadfromFile extends BookReader {

    File fr = null;
    Scanner scnr = null;
    @Override
    void initialize() {
        System.out.println("Open an input file");
        try {
            // Modify this method to open the file prideprejudice.txt (included with project)
            fr = new File("C:\\Users\\ayerj\\Downloads\\book-reader-template-method-master\\book-reader-template-method-master\\prideprejudice.txt");
            scnr = new Scanner(fr);
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadfromFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    void startReading() {
        // Modify this method to read lines from the file and print each line to standard output
        System.out.println("Loop writing out each record");
        
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println(line);
            lineNumber++;
        }       
    } 
    

    @Override
    void stopReading() {
        // Modify this method to close the file
        System.out.println("Close input file");
        
    }
}
