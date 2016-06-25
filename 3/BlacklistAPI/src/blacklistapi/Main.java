/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blacklistapi;
import java.lang.Boolean;

/**
 *
 * @author Nyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blacklist blacklist = new Blacklist("blacklist.txt");
        boolean isBlacklisted = blacklist.check_blacklist("Andi", 1341441);
        System.out.println(isBlacklisted);
    }
}
