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
public class Hausmischung extends Getränk{
        public Hausmischung(String b) {
        super(b);
    }

    @Override
    public double preis(){
        return 1.50;
    }
}
