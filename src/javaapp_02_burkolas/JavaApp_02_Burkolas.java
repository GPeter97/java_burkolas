/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_02_burkolas;

import java.util.Scanner;

/**
 *
 * @author grabe
 */
public class JavaApp_02_Burkolas {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kérem adja meg a szoba szélességét(m):");
        double szelesseg = sc.nextDouble();
        System.out.println("Kérem adja meg a magasságot(m):");
        double magassag = sc.nextDouble();
        
        double felulet = szelesseg*magassag*100*100; //cm
        double csempeFelulet = 20*20;
        long db=Math.round( felulet *1.1/csempeFelulet);
        String s=
         String.format("A %.2f m2 területü falfeluletnek"
                 +"a csempezeshez %d db csempe szükséges.", felulet,db);
        System.out.println(s);
    }
    
}
