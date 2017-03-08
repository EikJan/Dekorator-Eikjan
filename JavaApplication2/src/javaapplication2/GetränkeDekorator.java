/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author eikjan
 */
public class GetränkeDekorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DunkleRöstung dr = new DunkleRöstung("DunkleRöstung");
        System.out.println(dr.getBeschreibung());
        System.out.println(dr.preis());
        
        Hausmischung hm = new Hausmischung("Hausmischung");
        System.out.println(hm.getBeschreibung());
        System.out.println(hm.preis());
    }
}
