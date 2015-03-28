/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paroleapp;

import model.Parole;

/**
 *
 * @author Mattia
 */
public class ParoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Parole p = new Parole();
        
         int opzione;
        do {
            opzione = p.getInt();
        } while (opzione > 3 || opzione < 0);

        switch (opzione) {
            case 1:
                versioneHashSet(p);
                break;
            case 2:
                versioneHashMap(p);
                break;
            case 3:
              System.exit(0);
        }
    }
    public static void versioneHashMap(Parole p) {
        System.out.println("Numero di parole diverse tra loro: " + p.readFromFileHashMap());
    }
  public static void versioneHashSet(Parole p) {
        System.out.println("Numero di parole diverse tra loro: " + p.readFromFileHashSet());
    }
    }
    

