/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jethro
 */
public class Cv10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;
            while ((line = br.readLine())!=null){
                String [] items;
                items = line.split(",");     
            }
        } catch (FileNotFoundException ex) {
            System.err.format("File %s not found",args[0]);
            System.exit(1);
        } catch (IOException ex) {
            System.err.print("Error while reading a line");
            System.exit(1);
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter(args[1]);
            writer.print("Test");
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cv10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
