/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_age_global;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nyo
 */
public class Sorting_Age_Global {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "age.txt";
        
        SortAge sortAge = new SortAge();
        try {
            sortAge.sort(path);
        } catch (IOException ex) {
            Logger.getLogger(Sorting_Age_Global.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
