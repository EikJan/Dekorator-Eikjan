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
public class DunkleRöstung extends Getränk{

    public DunkleRöstung(String b) {
        super(b);
    }

    @Override
    public double preis(){
        return 0.99;
    }
    
}
