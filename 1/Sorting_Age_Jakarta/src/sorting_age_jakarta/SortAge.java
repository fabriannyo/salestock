/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_age_jakarta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Nyo
 */
public class SortAge {
    
    public SortAge(){
        
    }
    
    public void sort(String path) throws IOException{
        int[] ageIndexList = new int[151];
        
        Scanner inputFile = new Scanner(new File(path));
        int index = 0;
        
        while (inputFile.hasNextLine())
        {
            index = Integer.parseInt(inputFile.nextLine());
            ageIndexList[index]++;
        }
        inputFile.close();

        FileWriter write = new FileWriter("sorted_age.txt", false);
        PrintWriter outputFile = new PrintWriter(write);

        for (int i = 0; i < ageIndexList.length; i++){
            for (int j = 0; j < ageIndexList[i]; j++){
                outputFile.println(i);
            }
        }
        outputFile.close();
    }
}
