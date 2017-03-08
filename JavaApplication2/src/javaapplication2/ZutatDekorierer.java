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
public class ZutatDekorierer extends Getränk{
    private final Getränk g;
    public ZutatDekorierer(String beschreib, Getränk getränk){
        super (beschreib);
        g = getränk;
    }
    @Override
    public abstract double preis();
}
