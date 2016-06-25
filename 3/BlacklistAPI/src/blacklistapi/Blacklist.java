/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blacklistapi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nyo
 */
public class Blacklist {
    private String path;
    private Map<Integer,List<String>> list = new HashMap<>();
    
    public Blacklist(String filePath){
        path = filePath;
        try {
            initialize(path);
        } catch (IOException ex) {
            Logger.getLogger(Blacklist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void initialize(String blacklist) throws IOException{
        Scanner inputFile = new Scanner(new File(blacklist));
        
        while (inputFile.hasNextLine()){
            String[] arrData = inputFile.nextLine().split(" ");
            addData(Integer.parseInt(arrData[1]), arrData[0]);
        }
    }
    
    private void addData(Integer key, String value){
        List<String> currentValue = list.get(key);
        if (currentValue == null){
            currentValue = new ArrayList<>();
            list.put(key, currentValue);
        }
        currentValue.add(value);
    }
    
    public boolean check_blacklist(String name, int phone_number){
        List<String> nameList = list.get(phone_number);
        if (nameList != null){
            if (nameList.contains(name))
            {
                return true;
            }
        }
        return false;
    }
}
